import java.io.*;
public class primesandsum
{
	public static void main(String args[])  throws IOException
	{
	int low,up,pos;
	int sum,temp,num;
	int sumPrimeNo=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  	System.out.println("Enter the Lower Limit : ");
 	low=Integer.parseInt(br.readLine());
	System.out.println("Enter the Uper Limit : ");
 	up=Integer.parseInt(br.readLine());
 	pos=up;

 	boolean found = false;
	boolean isPrime = true;
	boolean isSumPrime = true;
	for(int i=low;i<=up;i++)
	{
	isPrime = true;
	for(int j=2; j <= i/2; j++) 
	{
		if((i % j) == 0) 
		{
		isPrime = 	false;
		break;
		}
	}
	if(isPrime) 
	{
		num=i;
		sum=0;
		while(num>0)
		{
		temp=num%10;
		num=num/10;
		sum=sum+temp;
		}
		isSumPrime = true;
		for(int k=2; k <= sum/2; k++) 
		{
			if((sum % k) == 0) 
			{
			isSumPrime = false;
			break;
			}
		}
		if(isSumPrime) 
		{
			sumPrimeNo++;
			}
		
	
	}
	
	}
	System.out.println(sumPrimeNo);
	
	}
}