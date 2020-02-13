import java.util.Scanner;
import java.lang.Math;
public class SphereVolume 
{ 
	public static void main(String[] args) 
	{ 
		Scanner stdin = new Scanner(System.in);
		System.out.println("This program reads in measures and uses them to calculate the volume of a sphere.");
		System.out.print("Please enter the diameter of the sphere in centimeters.");
		double diam = stdin.nextDouble();
		double radius = diam/2;
		final double three = 3;
		double volume = (4/three)*Math.PI*Math.pow(radius, three);
		System.out.print("The volume of the sphere is " + volume + " cubic centimeters.");
		stdin.close();
	} 
} 
