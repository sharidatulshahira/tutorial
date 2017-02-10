/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rad = new Scanner(System.in);
		
		System.out.print("Type the radius: ");
		double radius = Double.parseDouble(rad.nextLine());
		
		double circumference = 2 * Math.PI * radius;
		
		System.out.println("\n" + "Circumference of the circle: " + circumference);
		

	}

}
