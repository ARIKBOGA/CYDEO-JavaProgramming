package week3;


public class Questions {
    public static void main(String[] args) {
       /** Scanner scan =new Scanner(System.in);
        int inputSeconds= scan.nextInt();
        int hours= inputSeconds / 3600;
        int minutes = (inputSeconds % 3600) / 60;
        int seconds= inputSeconds % 60;
        System.out.println(hours+":"+minutes+":"+seconds); */

        int a=20;
        System.out.println("a = " + a++); //21
        System.out.println("a = " + --a); //20
        System.out.println("a = " + a);
        int c=20;
        System.out.println(c);
        System.out.println(c++ + 1);
        System.out.println("c = " + c);

        System.out.println(c%=4);
        System.out.println(c*=34);
        System.out.println(c+=45);
        System.out.println(c/=6);
        System.out.println(c^= 0b100);
    }
}
