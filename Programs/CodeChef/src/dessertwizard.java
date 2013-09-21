import java.io.*;
public class dessertwizard {
public static void main(String[] args){
	try{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		int q=Integer.parseInt(br.readLine());
		for(int i=0;i<q;i++){
			int y=Integer.parseInt(br.readLine());
			String h[]=br.readLine().split(" ");
			int a[]=new int[y];
			int ans=0;
			for(int w=0;w<y;w++){
				a[w]=Integer.parseInt(h[w]);
			}
			int m=0;
			int n=0;
			n=a[y-1];
			m=0;
			ans=n-m;
			if(ans<0){
				ans=-ans;
			}
			for(int w2=y-2;w2>0;w2--){
				n=n+a[w2];
				int f=m;
				for(int w3=0;w3<w2;w3++){
					f=f+a[w3];
					int g=n-f;
					if(g<0){
						g=-g;
					}
					if(g>ans){
						ans=g;
					}
				}
				
			}
			System.out.println(ans);
		}
		
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
}
