/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type a year: ");
		int year = Integer.parseInt(scan.nextLine());
		
		if ((year % 400 == 0 || year % 4 == 0) && (year % 100 != 0)){
			System.out.println("The year is a leap year");
		}
		
		else {
			System.out.println("The year is not a leap year");
		}
	}

}
