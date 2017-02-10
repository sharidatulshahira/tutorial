/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner divide = new Scanner(System.in);

		//insert num1
		System.out.print("Type a number: ");
		double num1 = Double.parseDouble(divide.nextLine());
		
		//insert num2
		System.out.print("Type another number: ");
		double num2 = Double.parseDouble(divide.nextLine());
		
		//calculate total division for both numbers
		double totalDvd =  num1 / num2;
		
		//display the total
		System.out.print("\n" + "Division: " + num1 + " / " + num2 + " " + "= " + totalDvd);

	}

}
