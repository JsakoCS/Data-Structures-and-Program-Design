// Programmer : Jsako

public class LinkedString {
    
    private int size;
    private Node head;
    public LinkedString() {
        
        head = null;
        size = 0;
        
    }
    
    public LinkedString(char[] value) {
        
        if(value.length == 0)
            return;
        Node node = new Node(value[0]);
        head = node;
        size++;
        Node current = head;
        for(int nodeIndex = 1; nodeIndex < value.length; nodeIndex++) {
            
            node = new Node (value[nodeIndex]);
            current.next = node;
            current = node;
            size++;
            
        }
        
    }
    
    public LinkedString(String original) {
        
        if(original.length() == 0)
            return;
                Node node = new Node(original.charAt(0));
                head = node;
                size++;
                Node current = head;
                
        for(int nodeIndex = 1; nodeIndex < original.length(); nodeIndex++) {
            
            node = new Node(original.charAt(nodeIndex));
            current.next = node;
            current = current.next;
            size++;
            
        }        
                
    }
    
    public char charAt(int index) {
        
        Node current = head;
        for(int nodeIndex = 0; nodeIndex < size; nodeIndex++) {
            
            if(nodeIndex == index) {
                
                break;
                
            } else {
                
                current = current.next;
                
            }
            
        }
        
        return current.item;
        
    }
    
    public LinkedString concat(LinkedString str) {
        
        if(str.head == null) {
            
            return this;
            
        }
        
        else if(head == null) {
            
            size = str.length();
            return str;
            
        } else {
            
            Node current = head;
        while(current.next != null)
            current = current.next;
                current.next = str.head;
            size += str.length();
            return this;
            
        }
        
    }
    
    public boolean isEmpty() {
        
        return length() == 0;
        
    }
    
    public int length() {
        
        return size;
        
    }
    
    @Override public String toString() {
        
        char value[];
        value = new char[size];
        Node n = head;
        for(int i=0;i<size;i++) {
            
            value[i] = n.item;
            n = n.next;
            
        }
        
        String str = String.copyValueOf(value);
        return str;
        
    }
    
}
