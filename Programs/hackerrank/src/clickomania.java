import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class clickomania {
static int h[]=new int[3];
static void nextMove(int x, int y, int color, String [] grid){
	String d[][]=new String[20][10];
	h[0]=0;
	h[1]=0;
	h[2]=0;
	for(int i=0;i<20;i++){
		String h[]=grid[i].split("");
		for(int c=0;c<10;c++){
			d[i][c]=h[c+1];
		}
	}
	 
       for(int i=0;i<20;i++){
    	   for(int u=0;u<10;u++){
    		   if(d[i][u].compareTo("-")==0){
    			   continue;
    		   }
    		   else{
    		   int s=u;
    		   int a=i;
    		   int z=0;
    		   a--;
    		   while(((a)>=0)&&(d[a][u].compareTo(d[i][u])==0)){
    			   s=u;
    			   z++;
    			   {
    				   s--;
    	    		   while(((s)>=0)&&(d[a][s].compareTo(d[i][u])==0)){
    	    			   z++;
    	    			   s--;
    	    		   }
    	    		   s=u;
    	    		   s++;
    	    		   while(((s)<10)&&(d[a][s].compareTo(d[i][u])==0)){
    	    			   z++;
    	    			   s++;
    	    		   }
    			   }
    			   a--;
    		   }
    		   a=i;
    		   a++;
    		   while(((a)<20)&&(d[a][u].compareTo(d[i][u])==0)){
    			   s=u;
    			   z++;
    			   {
    				   s--;
    	    		   while(((s)>=0)&&(d[i][s].compareTo(d[i][u])==0)){
    	    			   z++;
    	    			   s--;
    	    		   }
    	    		   s=u;
    	    		   s++;
    	    		   while(((s)<10)&&(d[i][s].compareTo(d[i][u])==0)){
    	    			   z++;
    	    			   s++;
    	    		   }
    			   }
    			   a++;
    		   }
    		   s--;
    		   while(((s)>=0)&&(d[i][s].compareTo(d[i][u])==0)){
    			   a=i;
    			   z++;
    			   {
    				   while(((a)>=0)&&(d[a][u].compareTo(d[i][u])==0)){
    		    			  
    	    			   z++;
    					    a--;
    	    		   }
    	 a=i;
    	    		   a++;
    	    		   while(((a)<20)&&(d[a][u].compareTo(d[i][u])==0)){
    	    			  
    	    			   z++;
    					    a++;
    	    		   }
    			   }
    			   s--;
    		   }
    		   s=u;
    		   s++;
    		   while(((s)<10)&&(d[i][s].compareTo(d[i][u])==0)){
    			   z++;
    			   a=i;
    			   {
    				   while(((a)>=0)&&(d[a][u].compareTo(d[i][u])==0)){
    		    			  
    	    			   z++;
    					    a--;
    	    		   }
    	 a=i;
    	    		   a++;
    	    		   while(((a)<20)&&(d[a][u].compareTo(d[i][u])==0)){
    	    			  
    	    			   z++;
    					    a++;
    	    		   }
    			   }
    			   s++;
    		   }
    		   
    		   if(h[2]<z){
    			   h[0]=i;
    			   h[1]=u;
    			   h[2]=z;
    		   }
    	   }
       }
       }
       System.out.println(h[0]+"  "+h[1]);
    }

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int k = in.nextInt();

        String grid[] = new String[x];

        for(int i = 0; i < x; i++) {
            grid[i] = in.next();
        }

        nextMove(x, y, k, grid);
    }
}