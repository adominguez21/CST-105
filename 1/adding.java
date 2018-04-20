import java.util.Scanner;

public class adding {
	private static Scanner sc;
	
	public static void main(String[] args)
	{
	
	  int n, Reminder, sum=0;
	  sc = new Scanner(System.in);
	  System.out.println("Please Enter any Number");
	  int Number = sc.nextInt();
	  
	while(Number > 0) {
		  Reminder= Number % 10;
		  sum= sum+ Reminder;
		  Number= Number / 10; 
		
	  }
	  System.out.format("Sum of the digits of Given Number = %d", sum);
	}
}