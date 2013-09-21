import java.io.*;
import java.util.*;

public class april1{
	static ArrayList<Integer> list;
         public static void main(String[] args) throws IOException{
        	 InputStreamReader in=new InputStreamReader(System.in);
        	 BufferedReader br=new BufferedReader(in);
        	 String m=br.readLine();
        	  int n=Integer.parseInt(m);
        	  list=new ArrayList<Integer>();
        	  int m1[]=new int [n];
        	  for(int i=0;i<n;i++){
        		  int u=0;
        		  int u1=0;
        		 m=br.readLine();
        		 String h[]=m.split(" ");
        		  int h1[]=new int[2];
        		  
            	  h1[0]=Integer.parseInt(h[0]);
            	  h1[1]=Integer.parseInt(h[1]);
            	  int num[]=new int [h1[0]];
            	  m=br.readLine();
            	  String h2[]=m.split(" ");
            	  for(int i1=0;i1<h1[0];i1++){
            		 list.add(Integer.parseInt(h2[i1]));
            	  }
            	 
            	  for(int y=0;y<h1[1];y++){
            		  int j=list.get(0);
            		  int m5=0;
            		  for(int r=1;r<list.size();r++){
            			  if(j>list.get(r)){
            				  m5=r;
            				  j=list.get(r);
            			  }
            		  }
            		 j=list.remove(m5);
            		  u=u+j;
            		
            	  }
            	  for(int y1=h1[1];y1<h1[0];y1++){
            		  int j=list.remove(0);
            		  u1=u1+j;
            	  }
            	  m1[i]=u1-u;
            	
        	  }in.close();
        	  br.close();
        	  for(int i=0;i<m1.length;i++){
        		  System.out.println(m1[i]);
        	  }
        	  
         }
}
