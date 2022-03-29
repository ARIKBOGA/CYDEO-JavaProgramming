package day20_Arrays.PracticeTask;

public class StudentGrades {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        for (int i = 0; i < grades.length; i++) {
            if (scores[i] >= 90) grades[i] = 'A';
            else if (scores[i] >= 80) grades[i] = 'B';
            else if (scores[i] >= 70) grades[i] = 'C';
            else if (scores[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+" and grade is "+grades[i]);
        }
    }
}
