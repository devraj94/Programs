import java.io.*;
import java.math.*;
import java.util.*;

public class divquery {
	 public static void main(String[] args) {
	        try{
	        	 Scanner sc = new Scanner(System.in);
		        	int z=sc.nextInt();
	        	int y=sc.nextInt();
	        	int x[]=new int[z];
	        	for(int i=0;i<z;i++){
	        		x[i]=sc.nextInt();
	        	}
	        for(int i=0;i<y;i++){
	        	int a[]=new int[3];
	        	int ans=0;
	        	a[0]=sc.nextInt();
	        	a[1]=sc.nextInt();
	        	a[2]=sc.nextInt();
	        	for(int e=a[0]-1;e<a[1];e++){
	        		if(x[e]%a[2]==0){
	        			ans++;
	        		}
	        	}
	        	System.out.println(ans);
	        }
	        }catch(Exception e){
	            e.printStackTrace();
	            }
	        }
}
