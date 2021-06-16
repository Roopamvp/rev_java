package com.revature.com;
import java.util.Scanner;
public class UserInputGame {
	public static void main(String args[]) {
		Scanner num=new Scanner(System.in);
		System.out.println(" Enter the numbers : ");
		int x=num.nextInt();
		
		switch(x) {
		case 1 :
			System.out.println("Moving Right");
			break;
		case 2 :
			System.out.println("Moving Left");
			break;
		case 3 :
			System.out.println("Moving Up");
			break;
		case 4:
			System.out.println("Moving Down");
			break;
		case 'q':
			System.out.println("exit the program");
			break;
		default:System.out.println("Try Again");
		}
	}
	

}
