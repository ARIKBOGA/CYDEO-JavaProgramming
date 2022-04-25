package week15.customExceptions;


public class CustomExceptionTest {
    public static void main(String[] args) {

        double balance = 395.5;
        double itemPrice = 500.0;

        System.out.println("I have " + balance + " euros in my account the item is " + itemPrice);

        if (itemPrice > balance) {
            throw new InsufficientBalanceException("Transaction declined due to insufficient balance");
        }


    }
}
