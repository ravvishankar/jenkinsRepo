package childProgram;
import java.util.Scanner;
public class totalDigits {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("/t/t/t Enter the number");
		int num = sc.nextInt();
		int count = 0;
		while (num>0) {
			num/=10;
			count++;
		}
		System.out.println("totalDigits:"+ count);
	}

}
