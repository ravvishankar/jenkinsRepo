package arrayProgram;

public class MaxMin {
	public static void main(String[] args) {
		int arr[] = { 5, 3, 6, 4, 2, 1, 0, 7 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum number of the given array: "+ max);
		System.out.println("Maximum number of the given array: "+ min);

	}
}
