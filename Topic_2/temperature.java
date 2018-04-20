import java.util.Scanner; 

public class temperature {
	public static void main(String args[]){
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  a degree in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit-32)*(5.0/9.0);
        System.out.printf("%.0f Fahrenheit is %.1f Celsius\n\n", fahrenheit, celsius);
        System.out.print("Enter  a degree in Celsius: ");
        celsius = scanner.nextDouble();
        fahrenheit = (9.0 / 5.0) * celsius + 32;
        System.out.printf("%.0f Celsius is %.1f Fahrenheit", celsius, fahrenheit);


	
	}

}
 