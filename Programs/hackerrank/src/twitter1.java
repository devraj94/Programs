import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class twitter1 {
	static ArrayList<Integer> list1;
	static ArrayList<Integer> list;
	 public static void main(String[] args) throws IOException{
		 twitter1 a=new twitter1();
    	 InputStreamReader in=new InputStreamReader(System.in);
    	 BufferedReader br=new BufferedReader(in);
    	 list=new ArrayList<Integer>();
    	 list1=new ArrayList<Integer>();
    	 String m=br.readLine();
    	 String k[]=m.split(" ");
    	 int k1[]=new int[2];
    	 k1[0]=Integer.parseInt(k[0]);
    	 k1[1]=Integer.parseInt(k[1]);
    	 int p[]=new int [k1[0]];
    	 int pp[]=new int[k1[0]];
    	 int pa[]=new int [k1[1]];
    	 for(int u=0;u<2;u++){
    		 m=br.readLine();
        	 String k2[]=m.split(" ");
        	 if(u==0){
        		 for(int i=0;i<k1[0];i++){
            		 p[i]=Integer.parseInt(k2[i]);
            	 }
        	 }
        	 if(u==1){
        		 for(int i=0;i<k1[1];i++){
            		 pa[i]=Integer.parseInt(k2[i]);
            	 }
        	 }
    	 }
    	 int y=0;
    	 for(int i=0;i<k1[0];i++){
    		 pp[i]=0;
    		 for(int i1=0;i1<k1[1];i1++){
    			 if(p[i]>=pa[i1])
    				 pp[i]++;
    		 }
    		 if(pp[i]!=0){
    			 y++;
    			 list.add (pp[i]);
    		 }
    	 }
    	 Collections.sort(list);
    	 int g=0;
    	for(int i=0;i<list.size();i++){
    		if(k1[1]%y!=0)
    		g=(k1[1]/y)+1;
    		else
    			g=(k1[1]/y);
    		int f=list.remove(0);
    		if(f<g)
    		{
    			list1.add(f);
    			k1[1]=k1[1]-f;
    		}
    		if(f>g){
    			System.out.println(g);
    			break;
    		}
    		y--;
    	}
    	


    	 
}
	 
}
	 
	 