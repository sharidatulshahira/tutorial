/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner big = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		
		System.out.print("Type a number: ");
		int num1 = Integer.parseInt(big.nextLine());
		
		System.out.print("Type another number: ");
		int num2 = Integer.parseInt(big.nextLine());
		
		if (num1 >= num2){
			System.out.println("\n" + "The biggest number of two numbers given was: " + num1);
		}
		else if (num2 >= num1){
			System.out.println("\n" + "The biggest number of two numbers given was: " + num2);
		}
	
		
		

	}

}
