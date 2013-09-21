import java.io.*;
import java.util.*;
public class predictopus {
public static void main(String[] args){
	try{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int k=Integer.parseInt(br.readLine());
		for(int i=0;i<k;i++){
			Double r=Double.parseDouble(br.readLine());
			Double f=1-r;
			r=(1-r)/r;
			r=r+1;
			r=10000/r;
			Double h=2*r*f;
			Double b=10000-r;
			b=2*b*(1-f);
			b=b+10000-r;
			h=h+r;
			if(b>h){
				System.out.println(b);
			}else{
				System.out.println(h);
			}
			
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
	
}
}