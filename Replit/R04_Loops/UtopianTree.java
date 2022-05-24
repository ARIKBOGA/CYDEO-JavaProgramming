package R04_Loops;

public class UtopianTree {
    public static void main(String[] args) {
        int treeSize = 0;
        int growth;
        for (int i = 1; i <= 10; i++) {
            switch (i) {
                case 1:
                case 2:
                case 3:
                    treeSize++;
                    growth = 1;
                    break;
                default:
                    treeSize += 2;
                    growth = 2;
            }
            System.out.println("year " + i + " - growth " + growth + " cm\ntree size: " + treeSize + "cm");
        }
    }
}
