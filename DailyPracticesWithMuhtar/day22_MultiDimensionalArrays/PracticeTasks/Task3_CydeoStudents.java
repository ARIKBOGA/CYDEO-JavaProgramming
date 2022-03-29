package day22_MultiDimensionalArrays.PracticeTasks;

import java.util.Arrays;

public class Task3_CydeoStudents {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25Groups = {batch25Group1, batch25Group2, batch25Group3};

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1, batch24Group2, batch24Group3};

        /*
        for (int i = 0; i <batch24Groups.length; i++) {
            batch25Groups[i] = Arrays.copyOf(batch24Groups[i], batch24Groups[i].length);
        }
        */

        String[][] CydeoStudents = Arrays.copyOf(batch24Groups, batch24Groups.length + batch25Groups.length);
        for (int i = batch24Groups.length, j = 0; i < CydeoStudents.length; i++, j++) {
            CydeoStudents[i] = batch25Groups[j];
        }
        System.out.println(Arrays.deepToString(CydeoStudents));
    }
}