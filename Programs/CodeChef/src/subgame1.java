import java.io.*;
import java.util.*;
import java.math.*;

public class subgame1 {
	static ArrayList<BigInteger> List;
	static ArrayList<BigInteger> lista;
    public static void main (String [] args){
    	subgame1 q=new subgame1();
    	try{
    		InputStreamReader in =new InputStreamReader(System.in);
    		BufferedReader br=new BufferedReader(in);
    		int y=Integer.parseInt(br.readLine());
    		lista=new ArrayList<BigInteger>();
    		for(int i=0;i<y;i++){
    			int u=Integer.parseInt(br.readLine());
    			String h=br.readLine();
    			String j[]=new String[u];
    			j=h.split(" ");
    			List=new ArrayList<BigInteger>();
    			for(int d=0;d<j.length;d++){
    				List.add(new BigInteger(j[d]));
    			}
    			Collections.sort(List);
    			BigInteger l=q.gcd(List.get(1),List.get(0));
    			for(int s=2;s<List.size();s++){
    				l=(q.gcd(l,List.get(s)));
    			}
    			lista.add(l);
    		}
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    	for(int x=0;x<lista.size();x++){
    		System.out.println(lista.get(x));
    	}
    	
    }
    
    BigInteger gcd(BigInteger m, BigInteger n){
    	BigInteger d;
    	BigInteger f=new BigInteger("1");
    	BigInteger e=new BigInteger("0");
    	while(f.compareTo(e)!=0){
    		BigInteger b[]=m.divideAndRemainder(n);
    		m=n;
    		n=b[1];
    		f=b[1];
    	}
    	d=m;
    	return d;
    }
}
