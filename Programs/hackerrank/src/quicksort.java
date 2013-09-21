
import java.util.*;
public class quicksort {
       static ArrayList<Integer> list;
       static ArrayList<Integer> list1;
          static void partition(int[] ar) {
            list=new ArrayList<Integer>();
            list1=new ArrayList<Integer>();
            for(int i=1;i<ar.length;i++){
            	if(ar[i]<ar[0])
            		list.add(ar[i]);
            		else
            			list1.add(ar[i]);
            }
            list.add(ar[0]);
            for(int i=0;i<list1.size();i++){
            	list.add(list1.get(i));
            }
            for(int i=0;i<list.size();i++){
            	System.out.print(list.get(i)+" ");
            }
            
       }   

/* Tail starts here */
 
 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }
