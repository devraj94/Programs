import java.util.*;
import java.io.*;
public class lapindrome {
public static void main(String[] args){
	ArrayList<String> list1=new ArrayList<String>();
	ArrayList<String> list2=new ArrayList<String>();
	ArrayList<String> list=new ArrayList<String>();
	try{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int y=Integer.parseInt(br.readLine());
		for(int i=0;i<y;i++){
			list1.clear();
			list2.clear();
			list.clear();
           String line=br.readLine();
			String h[]=line.split("");
			int g=h.length;
			for(int f=1;f<g;f++){
				list.add(h[f]);
			}
			g=g-1;
			for(int f=0;f<g/2;f++){
				list1.add(list.remove(0));
			}
			if(g%2!=0){
				list.remove(0);
				for(int f=g;f>g/2+1;f--){
					list2.add(list.remove(0));
				}
			}else{
				for(int f=g;f>g/2;f--){
					list2.add(list.remove(0));
				}
			}
			Collections.sort(list1);
			Collections.sort(list2);
			if(list1.equals(list2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
