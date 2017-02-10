/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner (System.in);
		
		System.out.print("Type your name: ");
		String name1 = user.nextLine();
		
		System.out.print("Type your age: ");
		int age1 = Integer.parseInt(user.nextLine());
		
		System.out.print("\n" + "Type your name: ");
		String name2 = user.nextLine();
		
		System.out.print("Type your age: ");
		int age2 = Integer.parseInt(user.nextLine());
		
		int sumAge = age1 + age2;
		System.out.println("\n" + name1 + " and " + name2 + " are " + sumAge + " years old in total.");
		
		
		
		
	}

}
