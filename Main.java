import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicData.txt"));
        int count = 1; // Counter for square number
        int size = scan.nextInt(); // Read size of the first square

        while (size != -1) {
            Square square = new Square(size); // Create new Square
            square.readSquare(scan); // Read values into the square

            System.out.println("\n******** Square " + count + " ********");
            square.printSquare();

            // Print sums of rows, columns, and diagonals
            for (int i = 0; i < size; i++) {
                System.out.println("Sum of row " + i + ": " + square.sumRow(i));
                System.out.println("Sum of column " + i + ": " + square.sumCol(i));
            }
            System.out.println("Sum of main diagonal: " + square.sumMainDiag());
            System.out.println("Sum of other diagonal: " + square.sumOtherDiag());

            // Check and print if the square is magic
            System.out.println("Is magic? " + square.magic());

            // Move to the next square
            size = scan.nextInt();
            count++;
        }
    }
}
