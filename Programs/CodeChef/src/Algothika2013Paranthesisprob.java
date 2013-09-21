import java.io.*;
import java.util.*;
public class Algothika2013Paranthesisprob {
	static ArrayList <Integer> List;
   public static void main(String[] args)throws IOException{
	   Algothika2013Paranthesisprob e=new Algothika2013Paranthesisprob();
	     InputStreamReader in=new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(in);
	     String Line="";
	     int k=0;
	     List=new ArrayList<Integer>();
	      
	     Line =br.readLine();
	     int h=Integer.parseInt(Line);
	     int g[]=new int[h];
	     int f[] = new int[h];
	     for(int i=0;i<h;i++){
	    	 Line=br.readLine();
	    	 g[i]=Line.length();
	    	 f[i]=e.fun(g[i]);
	     }
	    for(int i=0;i<h;i++){
	    	
	    	System.out.println(f[i]);
	    }
   }
   
   int fun(int k){
	   int y=k-2;
	   int l=0;
	   if(y==0){
		   l=1;
	   }
	   while((y)>1){
		   int p=0;
		   if(y%2!=0){
			   int o=y;
			   
			   for(int i=1;i<=y/2;i++){
				   o=o-1;
				   int r=fact(i);
				   int g=fact1(i,y);
				   p=p+((g*2)/r);
			   }
			   p=p+2;
		   }
		   else{
			   int o=y;
			  
			   for(int i=1;i<y/2;i++){
				   o=o-1;
				   int r=fact(i);
				   int g=fact1(i,y);
				   p=p+((g*2)/r);
		   }
			   int r=fact(y/2);
			   int g=fact1(y/2,y);
			   p=p+(g/r);
			   p=p+2;
	   }
		   
		   y=y-1;
		   l=l+p;
    }
	   if(y==1){
		   l=l+1;
	   }
	 return l;
   }



int fact(int n){
	int fact=1;
	for (int c = 1 ; c <= n ; c++ ){
        fact = fact*c;
     }
	return fact;
}


int fact1(int n,int j){
	int fact1=1;
	int h=j;
	for(int c=1;c<=n;c++){
		fact1=fact1*h;
		h=h-1;
	}
	return fact1;
}

}


