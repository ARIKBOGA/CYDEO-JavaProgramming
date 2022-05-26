package day20_Arrays.PracticeTask;


public class classmatesInitials {
    public static void main(String[] args) {
        String[] names = {"burak arıkboğa", "yusuf olgun", "satı asude", "yasin ileri", "serpil özülü", "kadir bozkurt", "ece nur acar"};
        for (String s : names) {
            String[] temp = s.split(" ");
            for (String i : temp) {
                System.out.print(i.charAt(0) + " ");
            }
            System.out.println();
        }
    }
}