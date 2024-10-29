package Basics;
import java.util.*;
public class FactorsOfGivenNumber {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for (int i =1 ; i<=num; i++) {
			if (num%i==0) {
				System.out.print(i + ",");
			}
		}
		
	}

}
