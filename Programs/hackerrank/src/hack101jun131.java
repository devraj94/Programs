import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hack101jun131 {
    static ArrayList<String> list;
    static ArrayList<String> list1;
    static ArrayList<String> list2;
    public static void main(String[] args) {
    	list2=new ArrayList<String>();
    	try{
    		InputStreamReader in=new InputStreamReader(System.in);
    		BufferedReader br=new BufferedReader(in);
    		int k=Integer.parseInt(br.readLine());
    		for(int i=0;i<k;i++){
    			String line[]=(br.readLine()).split("");
    			if(line.length%2==0){
                   list2.add("-1");
    			}else{
    				int u=0;
    				list=new ArrayList<String>();
        			list1=new ArrayList<String>();
        			for(int j=1;j<=(line.length)/2;j++){
        				list.add(line[j]);
        			}
        			for(int j=((line.length)/2)+1;j<line.length;j++){
        				list1.add(line[j]);
        			}
        			Collections.sort(list);
        			Collections.sort(list1);
        			for(int j=0;j<list.size();j++){
        				if(list1.contains(list.get(j))){
        					u=u;
        					int h=list1.indexOf(list.get(j));
        					list1.remove(h);
        				}else{
        					u++;
        				}
        			}
        			list2.add(Integer.toString(u));
        			list.clear();
        			list1.clear();
        			
    			}
    		}
    		   for(int g=0;g<list2.size();g++){
    			   System.out.println(list2.get(g));
    		   }
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    }
}
