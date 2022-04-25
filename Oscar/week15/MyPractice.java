package week15;

public class MyPractice {
    public static void main(String[] args) {


        try {
            throw new NullPointerException();
        }catch (IndexOutOfBoundsException iobe){
            System.out.println("IndexOutOfBoundsException is occurred");
        }catch (NullPointerException iobe){
            System.out.println("NullPointerException is occurred");
        }
    }
}
