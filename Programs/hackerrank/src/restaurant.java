import java.io.*;
import java.util.*;

public class restaurant {
	public static void main(String[] args){

	int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,683,691,701,709,719,727,733 ,739,743,751,757,761,769,773};
    try{
    	InputStreamReader in=new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(in);
    	int h=Integer.parseInt(br.readLine());
    	for(int i=0;i<h;i++){
    		ArrayList<Integer> list1=new ArrayList<Integer>();
    		ArrayList<Integer> list2=new ArrayList<Integer>();
    		String j[]=br.readLine().split(" ");
    		int f=Integer.parseInt(j[0]);
    		int s=Integer.parseInt(j[1]);
    		int p=0;
    		int t=0;
    		if(s>f){
    			p=s;
    			t=f;
    		}else {
    			p=f;
    			t=s;
    		}
    		int b=0;
    		for(int u=p;u>0;u--){
    			if(p%u==0 && t%u==0){
    				b=u;
    				break;
    			}
    		}
    		System.out.println((f*s)/(b*b));
    }
    }
    catch(Exception e){
    	e.printStackTrace();
    }
	
	}
	}