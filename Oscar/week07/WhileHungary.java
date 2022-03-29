package week07;

public class WhileHungary {
    public static void main(String[] args) {
        boolean isHungary = true;
        int bananas = 0;
        int countToFull = 3;
        while (isHungary){
            bananas++;
            System.out.println("Eating a banana: \ud83d\ude18 "+bananas);
            if(bananas == countToFull)
                isHungary =false;
        }
    }
}
