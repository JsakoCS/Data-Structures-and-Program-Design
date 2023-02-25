// Programmer : Jsako

class Node{
    
    int data;
    Node nextNode;
  
    public Node(int data2) {
        data = data2;
        nextNode = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
}
