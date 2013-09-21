import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sudsol {

    static void sudoku_solve(int [][] grid){

    	if(sudoku_solver(grid,0,0)==1){
    		
    	    	for(int i=0;i<9;i++){
    	        	for(int y=0;y<9;y++){
    	        		System.out.print(grid[i][y]+" ");
    	        	}System.out.println();
    	        }
    	    }
        	
        
        else{
        	System.out.println("NO SOLUTION!!!");
        }
   
    
    }
    
   
 static int sudoku_solver(int [][] board,int row,int col){
    	int n=1;
    	if(9==row){
    		return 1;
    	}
    	if(board[row][col]!=0){
    		if(col==8){
    			if(sudoku_solver(board,row+1,0)==1) return 1;
    		}
    		else {
    			if(sudoku_solver(board,row,col+1)==1) return 1;
    		}
    	}
    	for(;n<10;n++){
    		if(r(n,board,row) && c(n,board,col) && b(n,board,row,col)){
    			board[row][col]=n;
    			if(col==8){
        			if(sudoku_solver(board,row+1,0)==1) return 1;
        		}
        		else {
        			if(sudoku_solver(board,row,col+1)==1) return 1;
        		}
    			board[row][col]=0;
    		}
    	}
    	return 0;
    }
    
  static  boolean r(int n,int[][]board,int row){
    	for(int i=0;i<9;i++){
    	  if(board[row][i]==n)
    	    return false;
    	}
    	return true;
    }
static boolean c(int n,int[][]board,int col){
	for(int i=0;i<9;i++){
  	  if(board[i][col]==n)
  	    return false;
  	}
  	return true;
    }
static boolean b(int n,int[][]board,int row,int col){
	if(row<=2){
		row=0;
		if(col<=2){
			col=0;
		}
		if(col<=5&&col>2){
			col=3;
		}
		if(col<=8 && col>5)
			col=6;
	}
	if(row>2&&row<=5){
		row=3;
		if(col<=2){
			col=0;
		}
		if(col<=5&&col>2){
			col=3;
		}
		if(col<=8 && col>5)
			col=6;
	}
	if(row>5&&row<=8){
		row=6;
		if(col<=2){
			col=0;
		}
		if(col<=5&&col>2){
			col=3;
		}
		if(col<=8 && col>5)
			col=6;
	}
	for(int i=0;i<3;i++){
		for(int y=0;y<3;y++){
			if(board[row+i][col+y]==n)
				return false;
		}
	}
	return true;
}
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int board[][] = new int[9][9];
int n;
        n = in.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 9; j++) {
                for(int k = 0; k < 9; k++) {
                    board[j][k] = in.nextInt();
                }
            }
           
            sudoku_solve(board);
        }
    }
}