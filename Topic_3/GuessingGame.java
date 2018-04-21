import java.util.Scanner; 



public class GuessingGame {
	public static Scanner keyboard;
	public static void main(String[] args) {
		int randomInteger;
		randomInteger = (int) (Math.random()* 999+1);
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		int guess;
		
		do {
		System.out.print("Enter a guess (1-1000");
		guess= keyboard.nextInt();
		System.out.println("Your guess is" + guess);
		
	
		if (guess == randomInteger)
			System.out.println("Your guess is correct!");
			
			else if (guess < randomInteger)
				System.out.println("Your guess is lower than the random integer");
			else if (guess > randomInteger)
				System.out.println("Your guess is higher than the random integer");
			

   }	while (guess != randomInteger); 
	}} 

