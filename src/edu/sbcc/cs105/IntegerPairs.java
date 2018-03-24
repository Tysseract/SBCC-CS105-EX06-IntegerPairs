/**
 * CS 105 Theory & Practice I
 * CRN: 62499
 * Assignment: Integer Pairs
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Mattys C vanZeyl
 */
package edu.sbcc.cs105;

import java.util.Scanner;

public class IntegerPairs {
    public static String countPairs(int i1, int i2, int i3, int i4) {
        int pairCount = 0;
        
        if(i1 == i2)pairCount++;
        if(i1 == i3)pairCount++;
        if(i1 == i4)pairCount++;
        if(i2 == i3)pairCount++;
        if(i2 == i4)pairCount++;
        if(i3 == i4)pairCount++;
        
        String countString;
		if(pairCount == 2) countString = "two pairs";
        else countString = "not two pairs";
        
        return countString;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("please enter four numbers, separated by spaces and press enter: ");
        System.out.print(countPairs(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
        in.close();
    }

}