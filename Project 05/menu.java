// Programmer : Jsako

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class menu implements userInterface {
    
    Scanner scan = new Scanner(System.in);
    phoneBook a ;
    
    public menu()
    {
        a = new phoneBook();
    }

    public void loadData() throws FileNotFoundException
    {
        File text = new File("phoneBook.txt");
        Scanner scan = new Scanner(text);
        String input;
        while(scan.hasNextLine())
        {
            input = scan.nextLine();
            String[] splitString = input.split("\\s+");
            String firstName = splitString[0];
            String lastName = splitString[1];
            String phoneNum = splitString[2];
            String fullName = firstName +" "+ lastName;
            person a1 = new person(fullName,phoneNum);
            a.addNode(a1);
        }
    }
        
    public void printOutBook()
    {
        a.inOrderTraverseTree(a.root);
    }

    public void add()
    {
        String newName;
        String newPhoneNum;
        System.out.println("Please Enter a Name: ");
        newName = scan.nextLine();
        System.out.println("Please Enter a Phone Number: ");
        newPhoneNum = scan.nextLine();
        person brandNew = new person(newName, newPhoneNum);
        a.addNode(brandNew);
    }
        
    public void delete()
    {
        String deleteName;
        System.out.println("Please Enter a Name: ");
        deleteName = scan.nextLine();
        a.remove(deleteName);
        System.out.println("User has been remove");
    }
        
    public void find()
    {
        String phoneNumberFind;
        node newUser;
        System.out.println("Please Enter a Phone Number to find the user: ");
        phoneNumberFind = scan.next();
        newUser = a.searchPhoneNum(a.root, phoneNumberFind);
        a.storeNumSwitch = true;
        if(a.userENumber == false)
        {
            System.out.println("User not exsit");
        }
        a.userENumber = false;
    }
        
    public void change()
    {
        String nameFound;

        System.out.println("Please Enter a Name to change its number: ");
        nameFound = scan.nextLine();
        a.searchName(a.root, nameFound);
        a.storeNameSwitch = true;
        if(a.userEName == false)
        {
            System.out.println("User not exist");
        }
        a.userEName = false;
    }
        
    public void quit() throws FileNotFoundException
    {
        a.save(a.root);
        a.writer.close();
    }
    
}
