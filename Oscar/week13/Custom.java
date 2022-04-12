package week13;

public class Custom {
    final int custom = 1;

}

class A extends Custom {

}

class Main {
    public static void main(String[] args) {
        A a = new A();

        System.out.println(a.custom);
    }

}