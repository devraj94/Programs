import java.io.*;
import java.util.*;
public class random {
	static ArrayList<String[]> list;
	static ArrayList<Integer> listedges;
	static ArrayList<Integer> listvertices;
      public static void main(String[] args) throws IOException{
    	  InputStreamReader in=new InputStreamReader(System.in);
    	  BufferedReader br=new BufferedReader(in);
    	  int ver=0;
    	  System.out.println("Vertices!!");
    	 ver=Integer.parseInt(br.readLine());
    	  System.out.println("Edges");
    	  int edges=Integer.parseInt(br.readLine());
    	  list=new ArrayList<String[]>();
    	  listedges=new ArrayList<Integer>();
    	  listvertices=new ArrayList<Integer>();
    	  for(int i=0;i<edges;i++){
    		  listedges.add(i);
    	  }
    	  for(int i=0;i<ver;i++){
    		  listvertices.add(i);
    	  }
    	  String verticed[][]=new String [ver][edges];
    	  for(int i=0;i<ver;i++){
    		  for(int y=0;y<edges;y++){
    			  verticed[i][y]=" ";
    		  }
    	  }
 while(listedges.size()!=0){
        			  Collections.shuffle(listvertices);
        			  int index=listvertices.get(0);
        			  Collections.shuffle(listvertices);
        			  int index1=listvertices.get(1);
        			  
}
 
 
 
 
      }
}
