/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.print("How old are you? ");
		int age = Integer.parseInt(scan.nextLine());
		
		if (age > 0 && age <= 120){
			System.out.println("OK");
		}
		
		else{
			System.out.println("Impossible!");
		}
		

	}

}
