import java.io.*;
public class CAO1 {
       public static void main(String[] args){
    	   try{
    		   InputStreamReader in =new InputStreamReader(System.in);
    			   BufferedReader br=new BufferedReader(in);
    			   int i=Integer.parseInt(br.readLine());
    			   int m[]=new int[i];
    			   for(int u=0;u<i;u++){
    				   String h[]=br.readLine().split(" ");
    				   int x=Integer.parseInt(h[0]);
    				   int y=Integer.parseInt(h[1]);
    				   if(x<5 || y<5){
    					   m[u]=0;
    				   }else{
    					   int count=0;
    					   char j[][]=new char[x][y];
    					   for(int g=0;g<x;g++){
        					   String b=br.readLine();
    						   for(int g1=0;g1<y;g1++){
    							   j[g][g1]=(b.charAt(g1));
    						   }
    						   
    					   }
    					   for(int row=2;row<=x-3;row++){
    						   for(int col=2;col<=y-3;col++){
    							   if((int)(j[row][col])==94){
    							 if(((int)(j[row][col-1])==94 && (int)j[row][col-2]==94)
    								   || (	(int)j[row][col+1]==94 && (int)j[row][col+2]==94)
    								   || (  (int)j[row-1][col]==94 && (int)j[row-2][col]==94 )
    								   || (  (int)j[row+1][col]==94 && (int)j[row+2][col]==94 )){
    								   count++;
    							   }
    						   }
    						   }
    					   }
    					   System.out.println(count);
    				   }
    			   }
    	   }catch(Exception e){
    		   e.printStackTrace();
    	   }
    	   
       }
}
