import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Wind Chill Calculator\n");
		
		double temperature;
		double windSpeed;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
		temperature = keyboard.nextDouble();
		
		while (temperature < -45 || temperature > 40)
		{
			System.out.print("ERROR Enter the temperature in Fahrenheit (must be >= -45 and <= 40): ");
			temperature = keyboard.nextDouble();
		}
		
		System.out.print("Enter the wind speed (must be >= 5 and <= 60): ");
		windSpeed = keyboard.nextDouble();
		
		while (windSpeed < 5 || windSpeed > 60)
		{
			System.out.print("ERROR Enter the wind speed (must be >= 5 and <= 60): ");
			windSpeed = keyboard.nextDouble();
		}
		
		double windChill = 35.74 + (0.6215*temperature) - (35.75*Math.pow(windSpeed, 0.16)) + (0.4275*temperature*Math.pow(windSpeed, 0.16));
		System.out.println("\nWind chill temperature: " + windChill + " degrees Fahrenheit");
		System.out.println("\nProgrammer: Noah Nesbitt");

	}

}
