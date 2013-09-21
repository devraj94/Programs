import java.io.*;
import java.util.*;
public class tochallengeornot {
public static void main(String[] args){
	try{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int h=Integer.parseInt(br.readLine());
      int b[]=new int[100000];
       String g[]=br.readLine().split(" ");
       for(int i=0;i<g.length;i++){
    	   b[Integer.parseInt(g[i])]=1;
       }
       int y=0;
       ArrayList<Integer> list=new ArrayList<Integer>();
       for(int i=0;i<100000;i++){
    	   if(b[i]==1){
    		   
    			   int x=i;
    			   for(int e=0;e<list.size();e++){
    				   if((x+x-list.get(e))<100000){
    					  
        					   b[x+x-list.get(e)]=0; 
        				   
    				   } 
    			   }
    			   list.add(i);
        		   b[i]=0;
    		    
    	   }
       }
       System.out.println(list.size());
       for(int q=0;q<list.size();q++){
    	   System.out.print(list.get(q)+" ");
       }
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
