
public class Palindromic {
	// checks whether number is prime or not 
	static int checkPrime(int n)
	{ 
		int count=0; 
		for(int i=1;i<=n;++i)
		{
			if(n%i==0)
				++count;
		}
		if(count==2)
			return 1;
		else 
			return 0;
	}
	//checks whether number is palindrome or not
	static int checkPalindrome(int n)
	{
		int temp=n,rev,sum=0
				while(n!=0)
				{
					rev=n&10
					sum=(sum*10)+rev;
					n=n/10
				}
		public static void main(String[]args)
	int status1=0, status2=0;
		for(int i=2;i<100000;++i)
		{
			status1=checkPrime(i);
			status2=checkPalindrome(i);
			if(status1==1 && status2==1)
				System.out.println(i+"");
		}
	}
	
}
