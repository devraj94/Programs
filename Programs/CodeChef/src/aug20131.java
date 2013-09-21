import java.io.*;
import java.util.*;
public class aug20131 {
	 public static void main(String[] args){
		 try{
    	 InputStreamReader in=new InputStreamReader(System.in);
    	 BufferedReader br=new BufferedReader(in);
    	 int t=Integer.parseInt(br.readLine());
    	 for(int i=0;i<t;i++){
    		 String h[]=br.readLine().split(" ");
    		long n=Long.valueOf(h[0]).longValue();
    		long k=Long.valueOf(h[1]).longValue();
    		System.out.print(n/k+" ");
    		System.out.println(n%k);
    	 }br.readLine();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		
	 }
}
