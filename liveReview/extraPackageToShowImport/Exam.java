package extraPackageToShowImport;

public class Exam {
    public static void main(String[] args) {
        String str = " ";
        System.out.println("str.isEmpty() = " + str.isEmpty());

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (arr[i][j].equals("B"))
                    break;
            }
        }

        int wd = 0;
        String[] days = {"sun", "mon", "wed", "sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -= 1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd += 2;
            }
        }
        System.out.println("wd = " + wd);
    }
}
