import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sudokusolver {
    int sudoku_solve(int [][] board,int row,int col){
    	int n=1;
    	if(9==row){
    		return 1;
    	}
    	if(board[row][col]!=0){
    		if(col==8){
    			if(sudoku_solve(board,row+1,0)==1) return 1;
    		}
    		else {
    			if(sudoku_solve(board,row,col+1)==1) return 1;
    		}
    	}
    	for(;n<10;n++){
    		if(r(n,board,row) && c(n,board,col) && b(n,board,row,col)){
    			board[row][col]=n;
    			if(col==8){
        			if(sudoku_solve(board,row+1,0)==1) return 1;
        		}
        		else {
        			if(sudoku_solve(board,row,col+1)==1) return 1;
        		}
    			board[row][col]=0;
    		}
    	}
    	return 0;
    }
    
    boolean r(int n,int[][]board,int row){
    	for(int i=0;i<9;i++){
    	  if(board[row][i]==n)
    	    return false;
    	}
    	return true;
    }
boolean c(int n,int[][]board,int col){
	for(int i=0;i<9;i++){
  	  if(board[i][col]==n)
  	    return false;
  	}
  	return true;
    }
boolean b(int n,int[][]board,int row,int col){
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
    public static void main(String[] args) {
    	sudokusolver a=new sudokusolver();
        Scanner in = new Scanner(System.in);
        int n;
        int board[][] = new int[9][9];
        int u=0;
        int v=0;
        n = in.nextInt();
        int boardfinal[][]=new int [9*n][9*n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 9; j++) {
                for(int k = 0; k < 9; k++) {
                    board[j][k] = in.nextInt();
                }
            }
            if(a.sudoku_solve(board,0,0)==1){
            	for(int row=0;row<9;row++){
            		for(int col=0;col<9;col++){
            			boardfinal[u+row][v+col]=board[row][col];
            		}
            	}
            	u=u+9;
            	v=v+9;
            }
            else{
            	System.out.println("NO SOLUTION!!!");
            }
           
        }
        in.close();
        for(int k=0;k<n;k++){
        	for(int i=0;i<9;i++){
            	for(int y=0;y<9;y++){
            		System.out.print(boardfinal[i][y]+" ");
            	}System.out.println();
            }
        }
        
    }
}

