// Programmer : Jsako

package phase1;

public class StackTester {
  
public static final int MAX_ITEMS = 15;

public static void main(String[] args) {
    StackArrayBased stack = new StackArrayBased();
    Integer items[] = new Integer[MAX_ITEMS];
    for (int i=0; i<MAX_ITEMS; i++){
        items[i] = new Integer(i);
        if (!stack.isFull()){
            stack.push(items[i]);
        }
    }
    while (!stack.isEmpty()){
        System.out.println((Integer)(stack.pop()));
    }
}
  
}
