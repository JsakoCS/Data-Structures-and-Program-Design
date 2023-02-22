// Programmer : Jsako

package phase1;

import java.util.Arrays;

public class StackArrayBased implements StackInterface {
    
    int MAX_STACK = 50;
    private Object items[];
    private int top;
  
    public StackArrayBased() {
        items = new Object[MAX_STACK];
        top = -1;
    }
  
    public boolean isEmpty(){
        return top < 0;
    }
  
    public boolean isFull(){
        return top == MAX_STACK-1;
    }

    public void push(Object newItem) throws StackException {
        items[++top] = newItem;
        if(isFull()){
            MAX_STACK = 2*MAX_STACK;
            Object[] temp_items = new Object[MAX_STACK];
            System.arraycopy(items, 0, temp_items, 0, items.length);
            items = temp_items;
        }
    }
  
    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }
  
    public Object pop() throws StackException {
        if (!isEmpty()) {
            return items[top--];
        } else {
            throw new StackException("StackException on " + "pop: stack empty");
        }
    }
   
    public Object peel() throws StackException{
        if (!isEmpty()){
            return items[top];
        } else {
            throw new StackException("Stack exception on " + "peek - stack empty");
        }
    }
  
    @Override
    public Object peek() throws StackException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
