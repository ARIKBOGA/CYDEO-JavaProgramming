package day41_Exceptions;

import day36_Inheritance.Task1.Employee.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getJobTitle());
        } catch (NullPointerException e) {
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Second catch block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Third catch block");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fifth catch block");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }
    }
}