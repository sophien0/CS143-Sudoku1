// to test Sudoku functionality
import java.io.FileNotFoundException;

public class SudokuMain {
   
   public static void main(String[] args)throws FileNotFoundException {
      //instantiating an object of your class  
      SudokuBoard puzzle = new SudokuBoard("data1.sdk");
      //print the object to the screen
      System.out.println(puzzle);
    }
}
