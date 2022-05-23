package day51_Map;

import java.util.*;

public class IteratingTheMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 99);
        students.put("Serkan", 70);
        students.put("Andriy", 98);

        /*
        Set<String> keys = students.keySet();
        for (String eachKey : keys) {
         //   System.out.println(eachKey +" : " + students.get(eachKey));
            students.replace(eachKey, students.get(eachKey) + 5);
        }
*/

        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>(); // score >= 90
        Map<String, Integer> angryBirds = new HashMap<>(); // score < 90

        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }


        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


        Set<String> names = students.keySet();
        System.out.println("Class of .keySet method : " + names.getClass().getSimpleName());

        System.out.println("--------------------------------------------------------");

        // Collection<Integer> scores = students.values();
        List<Integer> scores = new ArrayList<>(students.values());
        System.out.println("Class of .values method: " + names.getClass().getSimpleName());
        System.out.println(scores);


        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("--------------------------------------------------------");


        int maxScore = students.values()
                .stream()
                .max(Integer::compareTo)
                .orElse(0);

        int minScore = students.values()
                .stream()
                .min(Integer::compareTo)
                .orElse(0);

        System.out.println("maxScore - Stream = " + maxScore);
        System.out.println("minScore - Stream = " + minScore);


        System.out.println("--------------------------------------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------");

        // how many students has the score of 95 or greater

        int countOfScoresGreaterOrEqual_95 = (int) students.values()
                .stream()
                .filter(p -> p >= 95)
                .count();

        System.out.println("countOfScoresGreaterOrEqual_95 = " + countOfScoresGreaterOrEqual_95);


        System.out.println("--------------------------------------------------------");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }

}