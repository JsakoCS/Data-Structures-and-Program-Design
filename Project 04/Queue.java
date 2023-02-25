// Programmer : Jsako

class Queue {
    
    private Node head;
    private Node tail;
    int size;
  
    public Queue() {
        head=null;
        tail=null;
        size=0;
    }
  
    public boolean isEmpty() {
        if (size==0)
            return true;
        return false;
    }
  
    public int size() {
        return size;
    }
  
    public void enqueue(int data) {
        Node newNode = new Node(data);
      
        if(tail==null) {
            head=newNode;
            tail=newNode;
        } else {
            tail.setNextNode(newNode);
            tail=newNode;
        }
      
        ++size;
    }
  
    public int dequeue() {
        if (size==0) return -1;
      
        Node target = head;
        head = head.getNextNode();
        --size;
      
        if(head==null) tail=null;
        return target.getData();
    }
  
    public String toString() {
        if (isEmpty())
            return "EMPTY";
      
        String result="";
        Node runner=head;
      
        while(runner!=null){
            result+=(runner.getData()+", ");
            runner=runner.getNextNode();
        }
      
        return result;
    }
    
}
