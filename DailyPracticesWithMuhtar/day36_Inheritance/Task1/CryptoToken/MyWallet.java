package day36_Inheritance.Task1.CryptoToken;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWallet {
    public static void main(String[] args) {
        Bitcoin c1 = new Bitcoin();
        Etherium c2 = new Etherium();
        Cardano c3 = new Cardano();
        XRP c4 = new XRP();
        Doge c5 = new Doge();

        c1.setInfo(46_900, 1, 10, 100, 1000, false);
        c2.setInfo(3_400, 10, 20, 100, 1000, true);
        c3.setInfo(125, 250, 30, 100, 1000, true);
        c4.setInfo(0.6, 10000, 40, 100, 1000, true);
        c5.setInfo(46.900, 1, 50, 100, 1000, false);

        List<CryptoToken> cryptoTokenList = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));

        for (CryptoToken token : cryptoTokenList) {
            System.out.println(token.getClass().getSimpleName() + " - " + token.totalPrice());
        }

        double totalAssetPrice = cryptoTokenList
                .stream()
                .mapToDouble(CryptoToken::totalPrice)
                .sum();
        System.out.println("Total Funds: " + totalAssetPrice);

    }
}