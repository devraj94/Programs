import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
    	    try{
    	    	InputStreamReader in = new InputStreamReader(System.in);
    	    	BufferedReader br=new BufferedReader(in);
    	    	int A[]=new int[10];
    	    	int B[]=new int[10];
    	    	String As[]=br.readLine().split(" ");
    	    	for(int i=0;i<As.length;i++){
    	    		A[i]=Integer.parseInt(As[i]);
    	    	}
    	    	String Bs[]=br.readLine().split(" ");
    	    	for(int i=0;i<Bs.length;i++){
    	    		B[i]=Integer.parseInt(Bs[i]);
    	    	}
    	    	double h=Solution.findMedianSortedArrays(A,B);
    	    	System.out.println(h);
    	    }catch(Exception e){
    	    	e.printStackTrace();
    	    }
    	}
    
    public static double findMedianSortedArrays(int A[], int B[]) {
	       if(B.length>=A.length){
	            return median(A,A.length , B, B.length);
	       }else{
	            return median(B,B.length ,A ,A.length);
	       
	       }
	        
	    }
	    
	   public static double median(int A[] , int N , int B[] , int M){
		   if(N==1){
			   if(M==1){
				   return mo2(A[0], B[0]);
			   }else if(M%2!=0){
				   return mo2(B[M/2],(int)mo3(A[0],B[M/2-1],B[M/2+1]));
			   }else{
				   return mo3(B[M/2],A[0],B[M/2-1]);
			   }
		   }else if(N==2){
			   if(M==2){
				   return mo4(A[0],A[1],B[0],B[1]);
			   }else if(M%2!=0){
				   return mo3(B[M/2],max(A[0],B[M/2-1]),min(A[1],B[M/2+1]));
			   }else{
				   return mo4(B[M/2],B[M/2-1],max(A[0],B[M/2-2]),min(A[1],B[M/2+1]));
			   }
		   }else{
			   int remA=(N-1)/2;
			   int remB=(M-1)/2;
			   if(A[remA]>B[remB]){
				   int A1[]=new int[remA+1];
				   int B1[]=new int[M-remB];
				   for(int i=0;i<remA+1;i++){
					   A1[i]=A[i];
				   }
				   for(int i=remB;i<B.length;i++){
					   B1[i]=B[i];
				   }
				   return median(A1,A1.length,B1,B1.length);
			   }else{
				   int A1[]=new int[N-remA];
				   int B1[]=new int[remB+1];
				   for(int i=remA;i<N-remA;i++){
					   A1[i]=A[i];
				   }
				   for(int i=0;i<remB+1;i++){
					   B1[i]=B[i];
				   }
				   return median(A1,A1.length,B1,B1.length);
			   }
		   }
	   }
	   
	   public static int max(int a , int b){
		   return (a>b ?a:b);
	   }
	   public static int min(int a , int b){
		   return (a>b ?b:a);
	   }
	   public static double mo2(int a , int b){
		   return ((a+b)/2.0);
	   }
	   public static double mo3(int a , int b , int c){
		   return (a+b+c-max(a,max(b,c))-max(a,min(b,c)));
	   }
	   public static double mo4(int a , int b , int c, int d){
		   int Max = max( a, max( b, max( c, d ) ) );
		    int Min = min( a, min( b, min( c, d ) ) );
		    return ( a + b + c + d - Max - Min ) / 2.0;
	   }
    }


    	      