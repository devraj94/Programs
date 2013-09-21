import java.io.*;
import java.util.*;

public class aprilcook1 {
static ArrayList<Long> list;
static ArrayList<Integer> lit1;
static int q[];
static int b=0;
  public static void main(String[] args){
	  try{
		  InputStreamReader in=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(in);
		  list=new ArrayList<Long>();
		  lit1=new ArrayList<Integer>();
		 
		  int t=Integer.parseInt(br.readLine());
		  q=new int[t];
		  b=t;
		  for(int i=0;i<t;i++){
			  String h[]=br.readLine().split(" ");
			 int g=Integer.parseInt(h[0]);
			Long gk=Long.valueOf(h[1]).longValue();
			  String j[]=br.readLine().split(" ");
			  for(int r=0;r<j.length;r++){
				  list.add(Long.valueOf(j[r]).longValue());
			  }
			  Collections.sort(list);
			 Long p=new Long(0);
			  int w=0;
			  int u=0;
			  for(int d=list.size()-1;d>=0;d--){
				  w++;
				  p=p+list.get(d);
				  if(p/gk>0){
					  q[i]=w;
					  u=1;
					  break;
				  }
			  }
			  if(u==0){
				  q[i]=-1;
			  }
			  list.clear();
		  }br.close();
	  }
	  catch (Exception e){
		  e.printStackTrace();
	  }
	  for(int e=0;e<b;e++){
		  System.out.println(q[e]);
	  }
  }
}
