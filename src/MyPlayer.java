import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
        //print all combinations

        for(int x = 1; x < 4; x++){
            for(int y =0; y<=y; y++){
                for(int z =0; z<=z; z++){
                    if (y<= x && z <=y){
                        System.out.println("Reg board" + String.valueOf(x) + String.valueOf(y) + String.valueOf(z));
                        derivedBoards(x,y,z);
                    }

                }
            }
        }
    }

    public void derivedBoards (int i, int j, int k){
        int[]derivedBoards = new int [19];
        for(int x =1; x <=i; x++){
            for(int y = 0; y<=j; y++){
                for(int z =0; z <= k; z++){
                    System.out.println(x+""+y+""+z);

                }
            }
        }
    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
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
