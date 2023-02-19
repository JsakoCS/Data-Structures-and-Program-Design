// Programmer : Jsako

import java.util.Scanner;

public class HarmonicNum {
    
    public static void main(String[] args) {
        
        System.out.println("Enter a number and I will determine its harmonic sum : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("The harmonic sum of the entered number is : " + Harmonic(n));
        input.close();
        
    }
    
    public static double Harmonic(double n) {
        
        if (n < 2) {
            return 1;
        } else {
            return 1 / n + (Harmonic(n - 1));
        }
        
    }
    
}
