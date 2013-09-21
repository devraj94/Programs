import java.io.*;
import java.util.*;

public class icecreamparlour {
	static ArrayList<Integer> list;
   public static void main(String[] args) throws IOException{
	   InputStreamReader in=new InputStreamReader(System.in);
	   BufferedReader br=new BufferedReader(in);
	   list=new ArrayList<Integer>();
	   int T=Integer.parseInt(br.readLine());
	   for(int i=0;i<T;i++){
		   int cost=Integer.parseInt(br.readLine());
		   int flavours=Integer.parseInt(br.readLine());
		   String fcost[]=br.readLine().split(" ");
		   int fcost1[]=new int[flavours];
		   for(int u=0;u<flavours;u++){
			   fcost1[u]=Integer.parseInt(fcost[u]);
		   }
		   int m=0;
		   for(int i1=0;i1<flavours;i1++){
			   for(int y=0;y<flavours;y++){
				   if(y==i1)
					   continue;
				   else if(cost==fcost1[i1]+fcost1[y]){
					   list.add(i1+1);
					   list.add(y+1);
					   m=y;
					   break;
				   }
			   }
			   if(cost==fcost1[i1]+fcost1[m]){
				   break;
			   
			   }
		   }
		   
	   }
	   for(int i=0;i<T;i++){
		   System.out.println(list.remove(0)+" "+list.remove(0));
	   }
   }
}
