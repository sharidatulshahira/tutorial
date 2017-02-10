/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner add = new Scanner(System.in);
		
		//insert num1
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(add.nextLine());
		
		//insert num2
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(add.nextLine());
		
		//calculate total for both numbers
		int totalAdd = num1 + num2;
		
		//display the total
		System.out.print("Sum of the numbers: " + totalAdd);
	}

}
