/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
import java.util.Scanner;
public class Exercise18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Type the points [0-60]: ");
		int point = Integer.parseInt(scan.nextLine());
		
		if (point <= 29){
			System.out.println("\n" + "Grade: failed");	
		}
		
		else if (point >= 30 && point <= 34){
			System.out.println("\n" + "Grade: 1");
		}
		
		else if (point >= 35 && point <= 39){
			System.out.println("\n" + "Grade: 2");
		}
		
		else if (point >= 40 && point <= 44){
			System.out.println("\n" + "Grade: 3");
		}
		
		else if (point >= 45 && point <= 49){
			System.out.println("\n" + "Grade: 4");
		}
		
		else if (point >= 50 && point <= 60){
			System.out.println("\n" + "Grade: 5");
		}

	}

}
