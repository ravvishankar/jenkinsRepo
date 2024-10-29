package dataDrivenTesting;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomInt = rand.nextInt(1000);
		System.out.println(randomInt);
		
		
	}

}
