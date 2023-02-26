// Programmer : Jsako

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.PrintWriter;

public class phoneBook {

    node root;
    boolean storeNameSwitch = true;
    boolean userEName = false;
    boolean storeNumSwitch = true;
    boolean userENumber = false;
    String compareName ="";
    String compareNum ="";
    PrintWriter writer;
    boolean writerSwitch = true;
        
    public void addNode(person i)
    {
        node newNode = new node(i);

        if(root == null)
        {
            root = newNode;
        }
        else
        {
            node focusNode = root;
            node parent;
            while(true)
            {
                parent = focusNode;
                if(i.name.compareTo(focusNode.item.name) <0 )
                {
                    focusNode = focusNode.leftChild;
                    if(focusNode == null)
                    {
                        parent.leftChild=newNode;
                        return; 
                    }
                }
                else
                {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null)
                    {
                        parent.rightChild=newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(node focusNode)
    {
        if(focusNode != null)
        {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);              
        }
    }

    public boolean remove(String n)
    {
        node focusNode = root;
        node parent = root;

        boolean isItLeftChild = true;
        while(!focusNode.item.name.equalsIgnoreCase(n))
        {       
            parent = focusNode;
            // left child
            if(n.compareTo(focusNode.item.name)< 0)
            {
                isItLeftChild = true;

                focusNode = focusNode.leftChild;
            }
            // right child
            else
            {
                isItLeftChild = false;

                focusNode = focusNode.rightChild;
            }
            // empty
            if(focusNode == null)
            {
                System.out.println("User not exist");
                return false;
            }       
        }       
        // when no children under parent
        if(focusNode.leftChild == null&& focusNode.rightChild == null)
        {
            // root
            if(focusNode == root)
            {
                root = null;
            }
            // left child
            else if(isItLeftChild)
            {
                parent.leftChild = null;
            }
            // right child
            else
            {
                parent.rightChild = null;
            }
        }
        // when there is no right child
        else if (focusNode.rightChild == null)
        {
            // root
            if(focusNode == root)
            {
                root = focusNode.leftChild;
            }
            // left child
            else if(isItLeftChild)
            {
                parent.leftChild = focusNode.leftChild;
            }
            // right child
            else
            {
                parent.rightChild = focusNode.leftChild;
            }
        }
        // when there is no left child
        else if(focusNode.leftChild == null)
        {
            // root
            if(focusNode == root)
            {
                root = focusNode.rightChild;
            }
            // left child
            else if(isItLeftChild)
            {
                parent.leftChild = focusNode.rightChild;
            }
            // right child
            else
            {
                parent.rightChild =focusNode.leftChild;
            }
        }
        // parent connect to two children
        else
        {
            node replacement = getReplacementNode(focusNode);
            // root
            if(focusNode == root)
            {
                root = replacement;
            }
            // left child
            else if(isItLeftChild)
            {
                parent.leftChild = replacement;
            }
            // right child
            else
            {
                parent.rightChild = replacement;
            }
            replacement.leftChild = focusNode.leftChild;
        }
        return true;
    }

    public node getReplacementNode(node replaceNode)
    {
        node replacementParent = replaceNode;
        node replacement =replaceNode;

        node focusNode = replaceNode.rightChild;

        while(focusNode != null)
        {
            replacementParent = replacement;

            replacement = focusNode;

            focusNode = focusNode.leftChild;
        }

        if(replacement != replaceNode.rightChild)
        {
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replaceNode.rightChild;
        }
        return replacement;
    }

    public node searchPhoneNum(node focusNode,String phoneNumber)
    {
        if(storeNumSwitch)
        {
            compareNum = phoneNumber;
            storeNumSwitch = false;
        }
        if(focusNode != null)
        {
            searchPhoneNum(focusNode.leftChild, phoneNumber);
            if(phoneNumber.equals(focusNode.item.phoneNum))
            {
                System.out.println("This number belong to:"+ focusNode.item.name);
                userENumber = true;
                return null;
            }
            searchPhoneNum(focusNode.rightChild, phoneNumber);
            if(phoneNumber.equals(focusNode.item.phoneNum))
            {
                System.out.println("This number belong to:"+ focusNode.item.name);
                userENumber = true;
                return null;
            }
        }
        return focusNode;
    }

    public node searchName (node focusNode,String newName)
    {
        if (storeNameSwitch)
        {
            compareName = newName;
            storeNameSwitch = false;
        }
        if(focusNode!= null)
        {
            searchName(focusNode.leftChild, newName);
            if(compareName.equals(focusNode.item.name))
            {
                String newPhoneNumber;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please Enter a new number to replace old Number:");
                newPhoneNumber = scan.next();
                focusNode.item.phoneNum = newPhoneNumber;
                System.out.println("Number has been change");
                userEName = true;
                return null;
            }
            searchName(focusNode.rightChild, newName);
            if(compareName.equals(focusNode.item.name))
            {
                String newPhoneNumber;
                Scanner scan = new Scanner(System.in);
                System.out.println("Please Enter a new number to replace old Number:");
                newPhoneNumber = scan.next();
                focusNode.item.phoneNum = newPhoneNumber;
                System.out.println("Number has been change");
                userEName = true;
                return null;
            }
        }
        return focusNode;
    }

    public void save(node focusNode) throws FileNotFoundException
    {       
        if(writerSwitch)
        {
            writer = new PrintWriter("phoneBook.txt");
            writerSwitch = false;
        }
        if(focusNode != null)
        {
            save(focusNode.leftChild);
            if(focusNode != null)
            {
                System.out.println(focusNode);
                writer.println(focusNode.toString());
            }               
            save(focusNode.rightChild);     
        }
    }
        
}
