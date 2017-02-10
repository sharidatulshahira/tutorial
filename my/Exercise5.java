/**
 * 
 */
package com.tuto.my;

/**
 * @author SIsmail
 *
 */
public class Exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare variable
		int year = 365;
		int hours = 24;
		int min = 60;
		int sec = 60;
		
		//calculate total seconds in a year
		int totalSec = year * hours * min * 60;
		
		//display the result
		System.out.println("There are " + totalSec + " " + "seconds in a year.");

	}

}
