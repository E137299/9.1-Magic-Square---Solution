# 9.1-Magic-Squares

#### Objective  
Create a program to determine whether a square matrix is a *magic square*. A *magic square* is a square matrix where the sum of every row, column, and both diagonals is the same.

---

#### Instructions  

1. **Files to Work With**:  
   - `Square.java`: Implements the `Square` class with methods to handle square matrices.
   - `Main.java`: A test program to verify the magic square functionality.

2. **Requirements**:  
   - In `Square.java`, write the following methods:
     - `int sumRow(int row)`: Returns the sum of a specific row.
     - `int sumCol(int col)`: Returns the sum of a specific column.
     - `int sumMainDiag()`: Returns the sum of the main diagonal.
     - `int sumOtherDiag()`: Returns the sum of the secondary diagonal.
     - `boolean magic()`: Returns `true` if the square is magic.
     - `void printSquare()`: Prints the contents of the square, formatted neatly.

   - Complete `Main.java` to:
     - Read input from the file `magicData`.
     - Use the `Square` class to check whether the matrices in the file are magic squares.
     - Print the sums of rows, columns, and diagonals for each matrix.
     - Determine if the square is magic and print the result.

3. **Input**:  
   The file `magicData` contains multiple square matrices. The first value in the file specifies the size of the square (e.g., `3` for a 3x3 matrix). A `-1` marks the end of the file.  
   Example:  
   ```  
   3  
   8 1 6  
   3 5 7  
   4 9 2  
   -1  
   ```

4. **Expected Output**:  
   For each square:
   - Print the matrix.
   - Print the sums of all rows, columns, and diagonals.
   - Indicate whether it is a magic square.

---

### **Test Program**  

- Read the size of a square from `magicData`.
- Create a new `Square` object and populate it using the `readSquare` method.
- Print the matrix and check if it’s a magic square.  
 

**Input (`magicData`)**:  
```  
3  
8 1 6  
3 5 7  
4 9 2  
-1  
```  

**Output**:  
```  
******** Square 1 ********  
8 1 6  
3 5 7  
4 9 2  
Sum of row 0: 15  
Sum of row 1: 15  
Sum of row 2: 15  
Sum of column 0: 15  
Sum of column 1: 15  
Sum of column 2: 15  
Sum of main diagonal: 15  
Sum of other diagonal: 15  
Is magic? true  
```
