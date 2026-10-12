import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {

//a single field
char[][] board = new char[9][9];// I chose char because the Sudoku file contains numbers and "." .

//a constructor with a String parameter
public SudokuBoard(String data)throws FileNotFoundException { //prevent unexpected data
   board = new char[9][9];
   
   //open the file
   Scanner input = new Scanner(new File(data));
   
   //read the file (each raw)
   for(int r = 0; r < 9; r++){
   String line= input.next();
      //each column
      for(int c = 0; c < 9; c++){
      board[r][c] = line.charAt(c);
      }
   }
   //close the file
   input.close();
}

//toStrong method
public String toString(){
   //create an empty string
   String result = "";
   
   //go through every characters
   for(int r = 0; r < 9; r++){
      for(int c = 0; c < 9; c++){
         result += board[r][c] + " ";// add all the charcters together
      }
      result += "\n";//start a new line after each row
   }
   return result;
}


}
