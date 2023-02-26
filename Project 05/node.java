// Programmer : Jsako

public class node {
    
    person item;
    node leftChild;
    node rightChild;

    public node(person i)
    {
        item = i;
    }

    public String toString()
    {
        return item.name +"\t"+item.phoneNum;
    }
        
}
