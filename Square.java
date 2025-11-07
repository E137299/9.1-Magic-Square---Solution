import java.util.Arrays;
import java.util.Scanner;

public class Square {
    int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    public int sumRow(int row) {
        int sum = 0;
        for(int col = 0; col < square[row].length; col++){
            sum += square[row][col];
        }
        return sum;
    }

    public int sumCol(int col) {
        int sum = 0;
        for(int row = 0; row < square.length; row++){
            sum += square[row][col];
        }
        return sum;
    }

    public int sumMainDiag() {
        int sum = 0;
        for(int row = 0; row < square.length; row++){
            sum += square[row][row];
        }
        return sum;
    }

    public int sumOtherDiag() {
        int sum = 0;
        for(int row = 0; row < square.length; row++){
            sum += square[row][square.length-1-row];
        }
        return sum;
    }

    public boolean magic() {
        int total = 0;
        for(int row = 0; row < square.length; row++){
            total += sumCol(row);
        }
        for(int col = 0; col < square.length; col++){
            total += sumRow(col);
        }
        total+=sumMainDiag();
        total+=sumOtherDiag();

        return sumRow(0) == total/(square.length*2+2);
    }

    public void readSquare(Scanner scan) {
        for(int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    public void printSquare() {
        for(int[] row: square){
            System.out.println(Arrays.toString(row));
        }
    }
}

