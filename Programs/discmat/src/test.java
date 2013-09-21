import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;
/* type ../ to go out of a directory*/
/* we can give the path of a txt file to read*/
public class test {
	public static void main(String[] args){
		String d ="";
		
		try{
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			String s=br.readLine();
			FileReader fr=new FileReader(s);
			BufferedReader br1=new BufferedReader(fr);
			 d=br1.readLine();
			
		}
		
		catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println(d);
	}

}
