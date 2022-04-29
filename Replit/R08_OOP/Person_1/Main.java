package R08_OOP.Person_1;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person person = new Person();
        System.out.println(person.getFirstName());
        System.out.println(person.getAge());
        person.setAge(in.nextInt());
        System.out.println(person.getAge());

        Person person2 = new Person(in.next(), in.next(), in.nextInt());
        System.out.println(person2.getLastName());
        System.out.println(person2);


    }
}