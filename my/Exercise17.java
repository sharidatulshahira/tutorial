/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Type the first number: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Type the second number: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		if (num1 > num2){
			System.out.println("Greater number: " + num1);
		}
		
		else if (num1 == num2){
			System.out.println("\n" + "The numbers are equal!");	
		}
		
		else {
			System.out.println("\n" + "Greater number: " + num2);
		}

	}

}
