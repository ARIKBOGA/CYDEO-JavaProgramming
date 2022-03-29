package R05_Arrays;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (char c = 'a', j = 0; j < 8; c++, j++) {
                chessBoard[i][j] = "" + (i + 1) + c;
            }
        }
        System.out.println(Arrays.deepToString(chessBoard));
    }
}