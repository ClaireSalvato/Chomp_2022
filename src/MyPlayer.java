import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public ArrayList<Board> winningBoards = new ArrayList<>();
    public ArrayList<Board> losingBoards = new ArrayList<>();

    public MyPlayer() {
        columns = new int[10];

        losingBoards.add(new Board(1,0,0));



        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
        //print all combinations

        for (int x = 1; x < 4; x++) {
            for (int y = 0; y <= 3; y++) {
                for (int z = 0; z <= 3; z++) {
                    if (y <= x && z <= y) {
                        System.out.println("Reg board" + String.valueOf(x) + String.valueOf(y) + String.valueOf(z));
                        derivedBoards(x, y, z);
                    }

                }
            }
        }
    }

    public void derivedBoards(int i, int j, int k) {

        boolean foundIJKWinner = false;


        for (int x = k - 1; x >= 0; x--) {
            System.out.println(i + "" + j + "" + x + ": (" + x + ",2)");
        }
        for (int x = j - 1; x >= 0; x--) {
            if (x >= k) {
                System.out.println(i + "" + x + "" + k + ": (" + x + ",1)");
                for (int n = 0; n < losingBoards.size();n++) {
                    if (i == losingBoards.get(n).cols[0] && x == losingBoards.get(n).cols[1] && k == losingBoards.get(n).cols[2]) {
                        foundIJKWinner = true;
                        System.out.println("Winner winner chicken dinner");
                    }
                }
            }
            else {
                System.out.println(i + "" + x + "" + x + ": (" + x + ",1)");
            }

        }
        for (int x = i - 1; x > 0; x--) {
            if (j < x && k < x) {
                System.out.println(x + "" + x + "" + k);
            } else {
                System.out.println(x + "" + x + "" + x);
            }

        }

        if (foundIJKWinner == true) {
            winningBoards.add(new Board(i, j, k));
        } else {
            losingBoards.add(new Board(i, j, k));
        }
    }





    public Point move (Chip[][]pBoard){

        System.out.println("MyPlayer Move");

        //   gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
