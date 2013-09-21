import java.io.*;
import java.util.*;
public class TOTR{
    public static void main(String[] args) throws IOException{
    	InputStreamReader in=new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(in);
    	String Line="";
    	String str="_";
    	int m=0;
    	String[] s=null;
    	String w="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	if((Line=br.readLine())!=null){
    		s=Line.split(" ");
    		m=Integer.parseInt(s[0]);
    		String up=s[1].toUpperCase();
    		s[1]=s[1].concat(up);
    		
    	}
    	String[] Line1=new String[m];
    	for(int i=0;i<m;i++){
    		Line1[i]=br.readLine();
    		
    	}
    	for(int i=0;i<m;i++){
    		for(int h=0;h<Line1[i].length();h++){
    			char d=Line1[i].charAt(h);
    			String f=Character.toString(d);
    			if(s[1].contains(f)){
    				int y=w.indexOf(f);
    				System.out.print(s[1].charAt(y));
    			}
    			
    			else if(f.equals(str)){
    				System.out.print(" ");
    			}
    			else{
    				System.out.print(f);
    			}
    			
    			
    		}if(i!=m-1){
				System.out.println();
    		}
    	}
    	
    }
}
