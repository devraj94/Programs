
public class hai {
	public static void main(String[] args){
		hai d=new hai();
		int [] a=new int[10];
		for(int i=0;i<10;i++){
			a[i]=i;
		}
		if(d.hai1(a))
			System.out.println("yes");
	}
     
	
	boolean hai1(int a[]){
		for(int i=0;i<10;i++){
	    	if(a[i]==9)
	    		return true;
	     }
		return false;
	}
}
