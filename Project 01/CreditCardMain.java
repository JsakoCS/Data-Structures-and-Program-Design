// Programmer : Jsako

public class CreditCardMain {

    public static void main(String[] args) {
        
        CreditCard c1 = new CreditCard("Joseph Sako", "0123456789", 1000);
        System.out.println(c1.toString());
        System.out.println(c1.creditCharge(33.33));
        System.out.println(c1.cashAdvance(50.0));
        System.out.println(c1.creditPayment(100.0));
        System.out.println(c1.accountInterest(0.0009));
        
        CreditCard c2 = new CreditCard("Joey Sako", "9876543210", 2000);
        System.out.println(c2.toString());
        System.out.println(c2.creditCharge(66.66));
        System.out.println(c2.cashAdvance(100.0));
        System.out.println(c2.creditPayment(200.0));
        System.out.println(c2.accountInterest(0.0009));
        
        CreditCard c3 = new CreditCard("Joe Sako", "0456123789", 3000);
        System.out.println(c3.toString());
        System.out.println(c3.creditCharge(99.99));
        System.out.println(c3.cashAdvance(150.0));
        System.out.println(c3.creditPayment(300.0));
        System.out.println(c3.accountInterest(0.0009));
        
    }
    
}
