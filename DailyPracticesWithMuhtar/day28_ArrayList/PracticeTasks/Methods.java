package day28_ArrayList.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Methods {

    // Sets the last element of the Integer arraylist to zero
    public static List<Integer> setZeroToLast(List<Integer> list) {
        list.set(list.size() - 1, 0);
        return list;
    }

    // Swaps the first and last elements of an integer arraylist
    public static List<Integer> swapFirstAndLastElement(List<Integer> list) {
        int temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
        return list;
    }

    //  Multiplies each odd number by 2
    public static List<Integer> multiplyOddsByTwo(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                list.set(i, list.get(i) * 2);
            }
        }
        return list;
    }

    // Combines two String arrays into one arrayList
    public static ArrayList<String> combineArays(String[] arr1, String[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(List.of(arr1));
        list.addAll(List.of(arr2));
        return list;
    }

    // Returns the max value of the given List
    public static int maxNumberOfList(List<Integer> list) {
        return Collections.max(list);
    }

    // Returns the min value of the given List
    public static int minNumberOfList(List<Integer> list) {
        return Collections.min(list);
    }

    // Returns the first duplicated element of the given List
    public static int firstDuplicated(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i != list.lastIndexOf(list.get(i))) return list.get(i);
        }
        return -1;
    }

    // Calculates the grades of the given scores list
    public static void calculateGrades(List<Integer> scores) {
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (Integer score : scores) {
            if (score > 89) gradeOfA.add(score);
            else if (score > 79) gradeOfB.add(score);
            else if (score > 69) gradeOfC.add(score);
            else if (score > 59) gradeOfD.add(score);
            else gradeOfF.add(score);
        }
        System.out.println("Count of 'A' grades: " + gradeOfA.size());
        System.out.println("Count of 'B' grades: " + gradeOfB.size());
        System.out.println("Count of 'C' grades: " + gradeOfC.size());
        System.out.println("Count of 'D' grades: " + gradeOfD.size());
        System.out.println("Count of 'F' grades: " + gradeOfF.size());
    }

    public static void main(String[] args) {
        System.out.println(setZeroToLast(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(swapFirstAndLastElement(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(multiplyOddsByTwo(Arrays.asList(1, 2, 3, 4, 5)));
        System.out.println(combineArays(new String[]{"js", "css"}, new String[]{"xml", "json"}));
        System.out.println(maxNumberOfList(Arrays.asList(1, 23, 3, 4, 5)));
        System.out.println(minNumberOfList(Arrays.asList(1, 23, 3, -4342, 5)));
        System.out.println(firstDuplicated(Arrays.asList(1, 23, 3, 4, 4, 5)));
        calculateGrades(Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
    }
}