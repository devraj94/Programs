/*This program prints the min or max path from selected root to all other vertices 
 * vertices should be numbered starting from 1 and in increasing order
 * it prints dist from root to other vertices in root order 1,2,.....
 * program works only on connected graph...it fails for disconnected graphs
 * 
 * 
 * DATE: April-2013
 * BY:MAHARSHI DEVRAJ.K
 * */


import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class interval {
	static ArrayList<Integer> list=new ArrayList<Integer>();
	static ArrayList<Integer> list1=new ArrayList<Integer>();
	public static void main(String[] args)throws FileNotFoundException{
		interval a=new interval();
		String line="";
		String g1="";
		String g2="";
		int h=0;
		int dev=0;
		
		try{
			
			
			System.out.println("enter the address of graph txt file  n the name");
			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			g1=br.readLine();
			FileReader fr=new FileReader(g1);
			BufferedReader br1=new BufferedReader(fr);
			System.out.println("Enter the no of vertices!!");
			g2=br.readLine();
			h=Integer.parseInt(g2);//h=no of vertices
			
			System.out.println("Enter");
			System.out.println("1 for min distance ");
			System.out.println("2 for max distance ");
			System.out.println("3 for min spanning tree ");
			System.out.println("4 for max spanning tree");
			System.out.println("5 for random spanning tree or cut set");
			int choice=Integer.parseInt(br.readLine());
			String [][]adjmat=new String[h][h];//adjacency matrix of the graph
			String [][]tree=new String[h][h];//for spanning tree
			
			for(int i=0;i<h;i++){//storing tree matrix
				for(int g=0;g<h;g++){
					
					tree[i][g]="no edge";
				}
			}
			
			for(int i=0;i<h;i++){//storing adj matrix with nulls
				for(int g=0;g<h;g++){
					
					adjmat[i][g]="abc";
				}
			}
			/*for(int i=0;i<h;i++){
				for(int g=0;g<h;g++){
					System.out.println(adjmat[i][g]);	
				}
			}*/
			
			
			while((line=br1.readLine())!=null){
				String f[]=null;
				f=line.split(" ");
				int y=Integer.parseInt(f[0]);
				int q=f.length;
				
				for(int i=1;i<q;i++){
					
					a.spliting(f[i]);//a=>object for main class
					int s1=list.remove(0);
					String m=((list.remove(0)).toString()).concat(",");
					
					m=m.concat((list.remove(0)).toString());
					
					adjmat[y-1][s1-1]=m;
					m=null;
				}
				
			}
			
			int visited[]=new int[h];//visited contain visited vertices if unvisited then visited[unvisited vertex] is -999.
			int unvisited[]=new int[h];
			for(int i=0;i<h;i++){
				visited[i]=-999;
				unvisited[i]=i;
			}
			String distance[]=new String[h];//distance to store
			
			for(int i=0;i<h;i++){
				distance[i]="distance";
			}
			
			int t=0;
			
			if(choice!=5){
				
			
			 System.out.println("Enter the vertex which has to be taken as root");
			  t=(Integer.parseInt(br.readLine())-1);
			}
			else {
				t=0;
			}
			 if(choice==5){
					choice=3;
				}	
			 
			a.functiontransfer(unvisited,visited,adjmat,t,distance,h,choice,tree,dev);
			
			
			
			/*for(int i=0;i<h;i++){
				for(int g=0;g<h;g++){
					System.out.println(adjmat[i][g]);	
				}
			}*/
			br1.close();
		} 
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}

	/*splits the given string wrt comma */
	
	void spliting(String h){
		 String g[]=new String[3];
		 g=h.split(",");
		/* for(int i=0;i<3;i++){
			 System.out.println(g[i]);
		 } */
		 for(int i=0;i<3;i++){
			 int u=Integer.parseInt(g[i]);
			 
			 list.add(u);
			 
		 }
		
	 }
	
	/*comparing two intervals*/
	
	 int compare(int x1,int y1,int x2,int y2,int w){//w=1 means min interval else max interval
		 
		 if(y1<=x2){ //x on left of y 
			 if(w==1||w==3)
			 return 1;
			 else 
				 return 2;
		 }
		 else if( y2<=x1){// x on right of y 
			 if (w==1||w==3)
			 return 2;
			 else 
				 return 1;
		 }
		 else if(x1<=x2 && x2<=y1 && y1<=y2){//x starts on left of y but ends b4 y ends 
			 if(w==1||w==3)
				 return 1;
				 else 
					 return 2;
		 }
		 else if(x2<=x1 && x1<=y1 && y1<=y2){//y starts on left of x but ends b4 x ends 
			 if (w==1||w==3)
				 return 2;
				 else 
					 return 1;
			 
		 }
		
		 else if(x2<=x1 && y1<=y2){//x subset of y
			 int u=(y1-x1)/2;//mid of x
			 int v=(y2-x2)/2;//mid of y
			 
			 if(w==1||w==3){
				 
				 if( u<=v )
				 return 1;
				
				 else 
					 return 2;
			 }
			 else
			 {
				 if( u<=v )
					 return 2;
					 
					 else 
						 return 1;
			 }
			 
		 }
		 else if(x2>=x1 && y1>=y2){//y subset of x
			 int u=(y1-x1)/2;//mid of x
			 int v=(y2-x2)/2;//mid of y
			 
			 if(w==1||w==3){
				 
				 if( u>=v )
				 return 2;
				
				 else 
					 return 1;
			 }
			 else
			 {
				 if( u>=v )
					 return 1;
					 
					 else 
						 return 2;
			 }
		 }
		 else 
			 return 0;
		 
	 }
	 
	 
	 
	 //function tranfer here!!!!!!!!just to move away from the mess over there!!!!:)
	 
	 void functiontransfer(int unvisited[],int visited[],String adjmat[][],int v,String distance[],int h,int w,String tree[][],int dev){
		 dev++;
		 list.clear();
		list1.clear();
		distance[v]="0";
			list.add(v);
			
	
		
		int p=1;
		int d=0;
		while(p>0&&d<h){
			p=0;
			
			while(list.size()!=0){
				int y=list.remove(0);
				findingdistance(adjmat,distance,y,h,w,v,tree);
				unvisited[y]=-999;
				 visited[y]=y;
			}
			for(int i=0;i<unvisited.length;i++){
				if(unvisited[i]!=-999){
					p++;
				}
			}
			for(int i=0;i<list1.size();i++){
				list.add(list1.remove(0));
			}
			
			d++;
		}
		
		if(w==5||w==3||w==4){
			p=0;d=0;
			//next for and if are for non connected graphs
			for(int s=0;s<unvisited.length;s++){
				if(unvisited[s]!=-999){
					p++;
				}
			}
			
			if(p>0){
				for(int s=0;s<unvisited.length;s++){
					if(unvisited[s]!=-999){
						functiontransfer(unvisited,visited,adjmat,s,distance,h,w,tree,dev);
						dev--;
					}
				}
			}
				
		}
		
		if(w==2||w==1){
			for(int i=0;i<distance.length;i++){
				if(distance[i].compareTo("distance")==0)
				 distance[i]="0";
		}
		}
		
		if(w==2||w==1){//prints the min or max distance
			for(int i=0;i<distance.length;i++){
				 System.out.println(distance[i]);
		}
		 
		 }
		
		if((w==3||w==4||w==5) && dev==2){
			printtree(tree,h);
			
	 }
	 
	 

}
	 void printtree(String tree[][],int h){
			for(int i=0;i<h;i++){//printing max or min spanning tree
				for(int g=0;g<h;g++){
					if(((tree[i][g]).compareTo("no edge"))!=0){
						String d1=tree[i][g];
						tree[i][g]=d1.concat("  ");
					}
					System.out.print(tree[i][g]+"       ");
				}System.out.println();
			}
		} 
void findingdistance(String adjmat[][],String distance[],int y,int h ,int w,int v,String tree[][]){
		 for(int i=0;i<h;i++){
			 
			 if(y!=i && adjmat[y][i].compareTo("abc")!=0){
				 list1.add(i);
				 String f=adjmat[y][i];
				 String f1[]=new String[2];
				 f1=f.split(",");
				 int f3[]=new int[2];
				 f3[0]=Integer.parseInt(f1[0]);
				 f3[1]=Integer.parseInt(f1[1]);
				 if(v!=i && distance[i].compareTo("distance")==0){
					 distance[i]=f;
					 
				 }
				 else if(v!=i && distance[i].compareTo("distance")!=0){
					 String m=distance[i];
					
					 String f2[]=new String[2];
					 f2=m.split(",");
					int f4[]=new int[2];
					f4[0]=Integer.parseInt(f2[0]);
					f4[1]=Integer.parseInt(f2[1]);
					 
					 int u=compare(f3[0],f3[1],f4[0],f4[1],w);
					 if(u==1){
						 tree[y][i]=f;
						 tree[i][y]=f;
						 distance[i]=f;
					 }
					 else{
						 tree[y][i]=m;
						 tree[i][y]=m;
						 distance[i]=m;
					 }
					 
				 }
			 }
		 }
		 
		 
	 } 


}
