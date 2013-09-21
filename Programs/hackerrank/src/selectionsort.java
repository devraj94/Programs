

/* Head ends here */
import java.util.*;
public class selectionsort {
       
          static void insertionSort(int[] ar) {
        	  int m=0;
                   for(int i=1;i<ar.length;i++){
                	   for(int u=i;u>0;u--){
                		   if(ar[u-1]>ar[u]){
                			   int t=ar[u-1];
                			   ar[u-1]=ar[u];
                			   ar[u]=t;
                			   m++;
                		   }
                		   else
                			   break;
                	   }
                	   for(int i1=0;i1<ar.length;i1++){
                		   System.out.print(ar[i1]+" ");
                	   }System.out.println();
                   }System.out.println(m);
       }   

/* Tail starts here */

       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           insertionSort(ar);
       }    
   }


