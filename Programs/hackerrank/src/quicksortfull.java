

/* Head ends here */
import java.util.*;
public class quicksortfull {
          static void quickSort(int[] a,int low,int len) {
                    if(low>=len) return;    
      int l=low,n=len;  
      int piv=a[(l+n)/2];   
      while(l<n)
           {  
                while(l<n && a[l]<piv)   
                     l++;    
                while(l<n && a[n]>piv)  
                     n--;  
               if(l<n){  
                 int tem = a[l];  
                 a[l]=a[n];  
                 a[n]=tem; }             
           }
           if(n<l)
           {  
            int t = l;l=n;n=t;   
           }  
           quickSort(a,low,l);   
           
           quickSort(a,l==low?l+1:l,len); 
           
          
      }  
          

/* Tail starts here */
 
 
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar,0,ar.length-1);
           for(int u=0;u<(ar.length-1)/2;u++){
        	   System.out.print(ar[u]+" ");
           }System.out.println();
           for(int u=((ar.length-1)/2)+1;u<=ar.length-1;u++){
        	   System.out.print(ar[u]+" ");
           }System.out.println();
           for(int u=0;u<=(ar.length-1);u++){
        	   System.out.print(ar[u]+" ");
           }
           
       }    
   }
