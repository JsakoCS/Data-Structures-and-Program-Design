// Programmer : Jsako

public class Node {
    
    char item;
    Node next;
    public Node() {
        
        setItem(' ');
        setNext(null);
        
    }
    
    public Node(char newItem) {
        
        setItem(newItem);
        setNext(null);
        
    }
    
    public Node(char newItem, Node newNext) {
        
        setItem(newItem);
        setNext(newNext);
        
    }
    
    public Node(Node newNext) {
        
        setItem(' ');
        setNext(newNext);
        
    }
    
    public void setItem(char newItem) {
        
        item = newItem;
        
    }
    
    public void setNext(Node newNext) {
        
        next = newNext;
        
    }
    
    public char getItem() {
        
        return item;
        
    }
    
    public Node getNext() {
        
        return next;
        
    }
    
}
