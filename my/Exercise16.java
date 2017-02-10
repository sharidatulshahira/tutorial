/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise16 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a number: ");
		int num = Integer.parseInt(scanner.nextLine());
		
		
		
		if (num % 2 == 0){
			System.out.println("\n" + "Number " + num + " is even.");
		}
		
		else {
			System.out.println("\n" + "Number " + num + " is odd.");
		}
		
	}

}
