package arrayProgram;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 4, 2, 0, 1 };
		int temp;
		System.out.println("Array length: " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
