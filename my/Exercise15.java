/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.print("How old are you? ");
		int age = Integer.parseInt(scanner.nextLine());
		
		if (age >= 18){
			System.out.println("\n" + "You have reached the age of majority!");
		}
		
		else if (age < 18){
			System.out.println("\n" + "You have not reached the age of majority yet!");
		}

	}

}
