// Programmer : Jsako

public class ExponentsMain {

    public static void main(String[] args) {
        
        System.out.println(Power1(2.0, 10));
        System.out.println(Power2(2.0, 10));
        
    }
    
    public static double Power1(double x, int n) {
        
        double product = 1;
        for (int i = 0; i < n; i++) {
            product = product * x;
        }
        return product;
        
    }
    
    public static double Power2(double x, int n) {
        
        if (n == 0) {
            return 1;
        } else {
            return x * Power2(x, n - 1);
        }
        
    }
    
}
