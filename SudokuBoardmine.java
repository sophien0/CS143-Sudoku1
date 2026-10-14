import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoardmine {

//a single field
char[][] board = new char[9][9];// I chose char because the Sudoku file contains numbers and "." .

//a constructor with a String parameter
public SudokuBoardmine(String data)throws FileNotFoundException { //prevent unexpected data
   
   //open the file
   Scanner input = new Scanner(new File(data));
   
   //read the file (each raw)
   for(int r = 0; r < board.length; r++){
   String line= input.next();
      //each column
      for(int c = 0; c < board[r].length; c++){
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
   for(int r = 0; r < board.length; r++){
      for(int c = 0; c < board[r].length; c++){
         result += board[r][c] + " ";// add all the charcters together
      }
      result += "\n";//start a new line after each row
   }
   return result;
}


}
