package Basics;
import java.util.Scanner;
public class Palindrome1 {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int gn=num, temp = 0, rev = 0;
		while (num > 0) {
			temp = num % 10;
			rev = rev*10 + temp;
			num = num/10;
		}
		if(gn == rev)
		System.out.println("Palindrome:" +rev);
		else
			System.out.println("Not a palindrome");
	
	}

}
