// Programmer : Jsako

package phase2;

public class Node {
    
    private int item;
    private Node next;
    
    public Node() {
        item = 0;
        next = null;
    }
    
    public Node(int newItem) {
        setItem(newItem);
    }
    
    public Node(int newItem, Node newNext) {
        setItem(newItem);
        setNext(newNext);
    }
    
    public int getItem() {
        return item;
    }
    
    public Node getNext(){
        return next;
    }
    
    public void setItem(int newItem) {
        item = newItem;
    }
    
    public void setNext(Node newNext) {
        next = newNext;
    }
    
}
