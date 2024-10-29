package Basics;

public class Palindrome {

	public static void main(String[] args) {
		int num = 1221, gn=num, temp = 0, rev = 0;
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
