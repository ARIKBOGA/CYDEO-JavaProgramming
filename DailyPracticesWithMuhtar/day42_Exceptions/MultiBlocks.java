package day42_Exceptions;

import day36_Inheritance.Task1.Employee.Employee;

public class MultiBlocks {

    public static void main(String[] args) {


        Employee employee = null;

        System.out.println("Test Started ");

        try {
            System.out.println(employee.getSalary());
        } catch (NullPointerException e) {
            System.out.println("1. catch block got the exception ");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("2. catch block got the exception ");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("3. catch block got the exception ");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("4. catch block got the exception ");
            e.printStackTrace();
        }
        System.out.println("Test Completed ");


//
//        try {
//            System.out.println("Java".charAt(-1));
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        finally {
//
//        }


    }
}
