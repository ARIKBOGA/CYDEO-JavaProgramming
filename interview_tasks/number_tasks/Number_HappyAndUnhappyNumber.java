package number_tasks;

public class Number_HappyAndUnhappyNumber {

    /*
    1. write a function that can identify if a number is a happy Number or unhappy number
     */
    public static void main(String[] args) {
        System.out.println( (1 + 2) + "Java");
        System.out.println("Java" + 1 + 2);
        System.out.println("Java" + 1 * 2);

        int[ ] dizi = {1,2,3,4,5,6};

        System.out.println((dizi[1] + dizi[3]));
    }

    public static void solution(int n){

        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        if(n==1){
            System.out.println("Happy number");
        }else{
            System.out.println("Unhappy number");
        }
    }

}
