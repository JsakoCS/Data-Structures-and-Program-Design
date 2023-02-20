// Programmer : Jsako

import java.util.Scanner;

public class LinkedStringTest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        LinkedString list1 = new LinkedString(chars);
        System.out.print("The original string is ");
        System.out.println(chars);
        System.out.println("Is the list empty? " + list1.isEmpty());
        System.out.println("The characters length: " + list1.length());
        System.out.println("Enter the position of a character and press Enter: ");
        int pos1 = sc.nextInt();
        System.out.println("The character at position " + pos1 + " is " + list1.charAt(pos1));
        System.out.println("Enter a string: ");
        String strng1 = sc.next();
        LinkedString list2 = new LinkedString(strng1);
        System.out.println("The string is " + list2);
        System.out.println("That string concatanated with the original string is " + list1.concat(list2));
        sc.close();
        
    }
    
}
