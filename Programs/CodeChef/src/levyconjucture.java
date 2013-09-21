import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class levyconjucture {
	static ArrayList<Integer> list;
	static ArrayList<Integer> list1;
	static ArrayList<Integer> list2;
	public static void main(String[] args)throws IOException{
		levyconjucture a=new levyconjucture();
		InputStreamReader in=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(in);
		 int m=Integer.parseInt(br.readLine());
		 list=new ArrayList<Integer>();
		 list1=new ArrayList<Integer>();
		 list2=new ArrayList<Integer>();
		 for(int i=0;i<m;i++){
			 list.add(Integer.parseInt(br.readLine()));
		 }
		 
		 list1.clear();
		 for(int i=0;i<m;i++){
			 int g=list.remove(0);
			 System.out.print(g);
			 a.primes(g);
			 for(int s=0;s<list1.size();s++){
				 int f=0;
				 int e=list1.get(s);
				 for(int s1=0;s1<list1.size();s1++){
					 int e1=list1.get(s1);
					 if((e+2*e1)==g)
						 f++;
				 }
				 System.out.println(f);
				 list1.clear();
			 }
		 }
		 
	}
	void primes(int h){
		int m=0;
		list1.add(1);
		for(int i=2;i<=h;i++){
			for(int u=2;u<i;u++){
				if(i%u==0)
					m++;
			}
			if(m==0){
				list1.add(i);
				System.out.print(i);
			}
				
		}
	}
	 
}
