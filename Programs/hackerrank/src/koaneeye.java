import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class koaneeye {

    public static void main(String[] args) {
        try{
        	InputStreamReader in=new InputStreamReader(System.in);
        	BufferedReader br=new BufferedReader(in);
        	String gh[][]=new String[6][4];
        	for(int i=0;i<6;i++){
        		String line=br.readLine();
        		gh[i]=line.split("");
        	}
        	for(int u=5;u>=0;u--){
        		for(int h=3;h>=1;h--){
        			System.out.print(gh[u][h]);
        		}System.out.println();
        	}
        }catch(Exception e){
        e.printStackTrace();
        }
    }
}
