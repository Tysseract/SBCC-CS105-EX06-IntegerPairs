package edu.sbcc.cs105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter four numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		
		if((num1 == num2 && num3 == num4) || 
		   (num1 == num4 && num2 == num3) ||
		   (num1 == num3 && num2 == num4)) {
			System.out.println("two pairs"); 
		} else {
			System.out.println("not two pairs");
		}
		
		in.close();
	}

}
