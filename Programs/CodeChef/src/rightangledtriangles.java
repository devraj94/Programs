import java.io.*;
import java.math.*;
import java.util.*;

public class rightangledtriangles {
	 public static void main(String[] args) {
	        try{
	        	InputStreamReader in=new InputStreamReader(System.in);
	        	BufferedReader br=new BufferedReader(in);
	        	int y=Integer.parseInt(br.readLine());
	        	int ans=0;
	        	for(int i=0;i<y;i++){
	        		String h[]=br.readLine().split(" ");
	        		int j[]=new int[6];
	        		for(int f=0;f<6;f++){
	        			j[f]=Integer.parseInt(h[f]);
	        		}
	        		double r=0;
	        		ArrayList<Integer> df=new ArrayList<Integer>();
	        		df.add((((j[0]-j[2])*(j[0]-j[2]))+((j[1]-j[3])*(j[1]-j[3]))));
	        		df.add((((j[4]-j[2])*(j[4]-j[2]))+((j[5]-j[3])*(j[5]-j[3]))));
	        		df.add((((j[0]-j[4])*(j[0]-j[4]))+((j[1]-j[5])*(j[1]-j[5]))));
	        			if(df.get(0)>df.get(1) && df.get(0)>df.get(2)){
	        				r=df.remove(0);
	        			}else if(df.get(1)>df.get(0) && df.get(1)>df.get(2)){
	        				r=df.remove(1);
	        			}else{
	        				r=df.remove(2);
	        			}
	        		if((int)r==df.remove(0)+df.remove(0)){
	        			ans++;
	        		}
	        	}
		        System.out.println(ans);
	        }catch(Exception e){
	            e.printStackTrace();
	            }
	        }
}
