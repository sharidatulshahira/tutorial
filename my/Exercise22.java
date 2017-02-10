/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise22 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		
		
		
		while(true){
			System.out.print("Type the password: ");
			String pw = scan.nextLine();
			
			if (pw.equals("carrot")){
				System.out.println("Right!");
				System.out.println("\n" + "The secret is: jryy qbar!");
				break;
			}
			
			System.out.println("Wrong!");
		}
		
		

	}
	
	

}
