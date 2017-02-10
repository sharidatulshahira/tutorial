/**
 * 
 */
package com.tuto.my;

import java.util.Scanner;

/**
 * @author SIsmail
 *
 */
public class Exercise14 {

	/**
	 * @param args
	 */

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner scanner=new Scanner(System.in);
				
				System.out.print("Type a number: ");
				int num = Integer.parseInt(scanner.nextLine());
				
				if (num >= 0){
					System.out.println("\n" + "The number is positive");
				}
				
				else if (num < 0){
					System.out.println("\n" + "The number is not positive");
				}

			}

		


}

