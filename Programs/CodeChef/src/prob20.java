import java.util.*;
import java.math.*;
import java.io.*;
 
public class prob20 {
 
    public static final int MAX_SIZE = 100;
    public static BigInteger[] factorials = new BigInteger[MAX_SIZE + 1];
    public static BigInteger[] now = new BigInteger[0];
    static { 
        factorials[0] = BigInteger.ONE;
        init(); 
    }
 
    public static void init() {
        for (int i = 1; i <= MAX_SIZE; i++) {
            factorials[i] = factorials[i - 1].multiply(new BigInteger("" + i));
        }
    }
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int lineCount = sc.nextInt();
        BigInteger bi[] = new BigInteger[2];
        bi[0]=factorials[lineCount];
        bi[1]=BigInteger.ONE;
        BigInteger m=new BigInteger("0");
        BigInteger u=new BigInteger("10");
       while(bi[0].signum()!=0){
    	  BigInteger di[]=bi[0].divideAndRemainder(u);
    	  bi[0]=di[0];
    	  bi[1]=di[1];
    	   m=m.add(bi[1]);
    	   
        /*for (int i = 0; i < lineCount; i++) {
            System.out.println(factorials[sc.nextInt()]); */
        }sc.close();
        System.out.println(m);
       /* System.out.println(factorials[100]); */
    }
}