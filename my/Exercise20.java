/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Type your username: ");
		String name = scan.nextLine();
		
		System.out.print("Type your password: ");
		String pw = scan.nextLine();
		
		if ((name.equals("alex")) && (pw.equals("mightyducks")) ){
			System.out.println("You are now logged into the system!");
		}
		
		else if ((name.equals("emily")) && (pw.equals("cat")) ){
			System.out.println("You are now logged into the system!");
		}
			
		
		
		else{
			System.out.println("Your username or password was invalid!");
		}

	}

}
