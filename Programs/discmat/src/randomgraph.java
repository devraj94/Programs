/*PERSONAL NOTE(TO_DOs):
 * This program prints the min or max path from selected root to all other vertices
 * and also spanning trees
 * It also works for disconnected graphs
 * Max number of edges Should not exceed n(n-1)/2
 * For multiple edges between two vertices the method followed here will not work so should think on another method.
 * Also should check that it runs to infinite loop or some thing for some specific inputs should also see that!!!!
 *
 * DATE: April-2013
 * BY:MAHARSHI DEVRAJ.K
 * */

import java.io.*;
import java.util.*;
public class randomgraph {
	static ArrayList<Integer> listedges;
	static ArrayList<Integer> listvertices;
	static ArrayList<Integer> list=new ArrayList<Integer>();
	static ArrayList<Integer> list1=new ArrayList<Integer>();
	static int choice9=0;
	static int decision=0;
	static int ws=0;
	static String file22="";
  public static void main(String[] args)throws IOException{
	  randomgraph x=new randomgraph();
	  listedges=new ArrayList<Integer>();
	  listvertices=new ArrayList<Integer>();
	  InputStreamReader in=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(in);
	  System.out.println("DO YOU WANNA SAVE THIS RANDOM GRAPH AND ITS INFO?");
	  System.out.println("1:YES");
	  System.out.println("2:NO");
	  decision=Integer.parseInt(br.readLine());
	  String filename="";
	  if(decision==1){
		  System.out.println("Enter Under Which File Name You Wanna Save This(DONT FORGET ENTER ***.txt!!!)");
		  filename=br.readLine();
	  }
	  if(decision==2){
		  filename="Graph1.txt";
	  }
	  System.out.println("Can I Have Number Of vertices That Your Graph Should Possess!!!");
	  int ver=Integer.parseInt(br.readLine());
	  System.out.println("Here we go....Forgot to take Number of edges ..Provde me!!");
	  int edges=Integer.parseInt(br.readLine());
	  int vertices[][]=new int[ver][ver];
	  for(int i=0;i<ver;i++){
	       for(int r=0;r<ver;r++){
	    	   vertices[i][r]=0;
	       }
	  }
	  for(int i=1;i<=edges;i++){
		  listedges.add(i);
	  }
	  for(int i=1;i<=ver;i++){
		  listvertices.add(i);
	  }
	  /*System.out.println("Hey!!!one question!!");
	  System.out.println("how do you want your random graph to be??");
	  System.out.println("1:Max number of vertices connectd");
	  System.out.println("2:Leaving it to my self:(:(");*/
	 int choice=1;
	 System.out.println("what about weights of edges??");
	 System.out.println("1:I'll provide them");
	 System.out.println("2:Leaving it to my self!!");
	 int choice1=Integer.parseInt(br.readLine());
	 String weights[]=new String[edges];
	  if(choice==1){
		  while(listedges.size()!=0){

			  int index=0;
			  int index1=0;
			  Collections.shuffle(listvertices);
			  index=listvertices.get(0);
			  index1=listvertices.get(1);
			  if( vertices[index-1][index1-1]!=0){
				  for(int i=0;i<ver;i++){
					  for(int y=0;y<ver;y++){
						  if(y!=i){
								 index =listvertices.get(i);
								 index1=listvertices.get(y);
						  }
                if(vertices[index-1][index1-1]==0)
                	break;
					  }
				  }
			  }

			  vertices[index-1][index1-1]=listedges.get(0);
			  vertices[index1-1][index-1]=listedges.remove(0);

		  }
		  /*for(int i=0;i<ver;i++){
		       for(int r=0;r<ver;r++){
		    	   System.out.print(vertices[i][r]+" ");
		       }System.out.println();
		  }*/
	  }
	 /* int w2=0;
	  if(choice==1){
		  while(listedges.size()!=0){
			  int index=listvertices.get(w2);
			  int index1=new Random().nextInt(listvertices.size());
			  index1=listvertices.get(index1);
			  if(vertices[index][index1]==0){
				  vertices[index][index1]=listedges.remove(0);
				  vertices[index1][index]=listedges.remove(0);
				  w2++;
			  }
			  if(w2==ver){
				  w2=0;
			  }

		  }

	  }
	  w2=0;*/
		  if(choice1==1){
			  System.out.println("input the weights of edges as 2,3 4,5...where 2,3 is a interval and weight of 1st edge ");
			  weights=(br.readLine()).split(" ");
		  }
		  if(choice1==2){
			  for(int i=0;i<edges;i++){
				  int n1=new Random().nextInt(1000);
				  int n2=new Random().nextInt(1000);
				  String m=(Integer.toString(n1)).concat(",");
				  m=m.concat(Integer.toString(n2));
				  weights[i]=m;
			  }
		  }

		File file=new File(filename);
		if(!file.exists()){
			file.createNewFile();
		}
		  FileWriter wr=new FileWriter(filename);
		  BufferedWriter bw=new BufferedWriter(wr);
		  for(int i=0;i<ver;i++){
			  String k=(Integer.toString(i+1)).concat(" ");
			  for(int q=0;q<ver;q++){
				  if(vertices[i][q]!=0){
					  int g=vertices[i][q];
					  k=k.concat((Integer.toString(q+1)));
					  k=k.concat(",");
					  k=k.concat(weights[g-1]);
					  k=k.concat(" ");
				  }
			  }
			  bw.write(k);
			  bw.newLine();
		  }bw.close();
		  wr.close();
	  System.out.println("What properties do you wanna print of this graph");
	  System.out.println("1:print min,max lengths from a vertex,min,max spanning tree from a vertex and a random spanning tree");
	  System.out.println("2:You will provide me the specific one!!!");
	  int z=Integer.parseInt(br.readLine());
	  if(z==2){
			 x.function(ver,filename);
	  }
       if(z==1){
    	   for(int i=1;i<=5;i++){
    		   choice9=i;
    		   x.function(ver,filename);
    	   }
       }
       if(decision==2)
       file.delete();

       if(decision==1){
    	   try{
    		   File filer=new File("dev1.txt");
    		   FileReader fr33=new FileReader(filer);
    		   BufferedReader br33=new BufferedReader(fr33);
    		   FileWriter fr333=new FileWriter(filename,true);
				BufferedWriter br333=new BufferedWriter(fr333);

				br333.newLine();
				br333.flush();
				String linee="";
				while((linee=br33.readLine())!=null){
					br333.append(linee);
					br333.newLine();
					br333.flush();
				}
				 FileWriter fr334=new FileWriter("dev1.txt");
				 BufferedWriter br334=new BufferedWriter(fr334);
				 br334.append(null);
    	   }
    	   catch(IOException e){
    		   e.printStackTrace();
    	   }

       }


  }

  void function(int ver,String filename){

		String line="";
		String g1="";
		String g2="";
		int h=0;
		int dev=0;
		try{
			File file=new File("dev1.txt");
			file22="dev1.txt";
			if(!file.exists()){
				file.createNewFile();
			}
		 FileWriter fr22=new FileWriter(file22,true);
			BufferedWriter br22=new BufferedWriter(fr22);

			br22.newLine();
			br22.flush();
			if(choice9==1){
				System.out.println("NOW PRINTING MIN DISTANCE!!!!");
			}
			if(choice9==2){
				System.out.println("NOW PRINTING MAX DISTANCE!!!!");
			}
			if(choice9==3){
				System.out.println("NOW PRINTING MIN SPANNING TREE!!!!");
				br22.append("NOW PRINTING MIN SPANNING TREE!!!!");
				br22.flush();
			}
			if(choice9==4){
				System.out.println("NOW PRINTING MAX SPANNING TREE!!!!");
				br22.append("NOW PRINTING MAX SPANNING TREE!!!!");
				br22.flush();
			}
			if(choice9==5){
				System.out.println("NOW PRINTING RANDOM SPANNING TREE!!!!");
				br22.append("NOW PRINTING RANDOM SPANNING TREE!!!!");
				br22.flush();
			}
			
			br22.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{



			InputStreamReader in=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(in);
			g1=filename;
			FileReader fr=new FileReader(g1);
			BufferedReader brr=new BufferedReader(fr);

			h=ver;//h=no of vertices
			int choice=0;
			if(choice9==0){
				System.out.println("Enter");
				System.out.println("1 for min distance ");
				System.out.println("2 for max distance ");
				System.out.println("3 for min spanning tree ");
				System.out.println("4 for max spanning tree");
				System.out.println("5 for random spanning tree or cut set");
				choice=Integer.parseInt(br.readLine());
			}
			if(choice9!=0){
				choice=choice9;
			}

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

			list.clear();
			while((line=brr.readLine())!=null){
				String f[]=null;
				f=line.split(" ");
				int y=Integer.parseInt(f[0]);
				int q=f.length;

				for(int i=1;i<q;i++){

					spliting(f[i]);//a=>object for main class
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
			  ws=t;
			}
			else {
				t=0;
			}
			try{
				File file=new File("dev1.txt");
				file22="dev1.txt";
				if(!file.exists()){
					file.createNewFile();
				}
			 FileWriter fr22=new FileWriter(file22,true);
				BufferedWriter br22=new BufferedWriter(fr22);

				br22.newLine();
				br22.flush();
				br22.append("With vertex "+ws+1+" as root  that is from this vertex to all other vertices have max/min dist");
				br22.flush();
				br22.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			 if(choice==5){
					choice=3;
				}

			functiontransfer(unvisited,visited,adjmat,t,distance,h,choice,tree,dev,filename,ver);



			/*for(int i=0;i<h;i++){
				for(int g=0;g<h;g++){
					System.out.println(adjmat[i][g]);
				}
			}*/
			brr.close();
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

	 void functiontransfer(int unvisited[],int visited[],String adjmat[][],int v,String distance[],int h,int w,String tree[][],int dev,String filename,int ver){
		 dev++;
		int g=0;
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
						functiontransfer(unvisited,visited,adjmat,s,distance,h,w,tree,dev,filename,ver);
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
		if((decision==1)&&(w==2||w==1)){

				try{
					File file=new File("dev1.txt");
					file22="dev1.txt";
					if(!file.exists()){
						file.createNewFile();
					}

					FileWriter fr22=new FileWriter(file22,true);
					BufferedWriter br22=new BufferedWriter(fr22);

					br22.newLine();
					br22.flush();
					for(int i=0;i<distance.length;i++){
						 System.out.println(distance[i]);
						 if(choice9==1){
							 br22.append("MIN Distance from "+(v+1)+" vertex to "+(i+1)+" vertex is "+distance[i]);
							 br22.newLine();
							 br22.flush();
						 }
						 if(choice9==2){
							 br22.append("MAX Distance from "+(v+1)+" vertex to "+(i+1)+" vertex is "+distance[i]);
							 br22.newLine();
							 br22.flush();
						 }

				}
				br22.close();
				}
				catch(IOException s){
					s.printStackTrace();
				         }
				}
		else if(w==2||w==1){//prints the min or max distance


				for(int i=0;i<distance.length;i++){
					 System.out.println(distance[i]);

			}

			 }



		if((w==3||w==4||w==5)&&(dev==2)){
			g=1;
			if(decision==1){
				printtreensave(tree,h);
			}
			else{
				printtree(tree,h);
			}
			

	 }else if((w==3||w==4||w==5)&&(dev==1)&&(g==0)){
		 if(decision==1){
				printtreensave(tree,h);
			}
			else{
				printtree(tree,h);
			}

	 }



}
	 void printtreensave(String tree[][],int h){
		 try{
			 File file=new File("dev1.txt");
				file22="dev1.txt";
				if(!file.exists()){
					file.createNewFile();
				}
			 FileWriter fr22=new FileWriter(file22,true);
				BufferedWriter br22=new BufferedWriter(fr22);

				br22.newLine();
				br22.flush();
				for(int i=0;i<h;i++){//printing max or min spanning tree
					String sd="";
					sd.concat(i+1+" ---> ");
					br22.append(sd);
					for(int g=0;g<h;g++){
						if(((tree[i][g]).compareTo("no edge"))!=0){
							String d1=tree[i][g];
							tree[i][g]=d1.concat("  ");
					}
						System.out.print(tree[i][g]+"       ");
						br22.append(tree[i][g]+"       ");
						br22.flush();
					}
					br22.newLine();
					br22.flush();
					System.out.println();
				}
				br22.close();
		 }
		 catch(Exception e){
			 e.printStackTrace();
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


