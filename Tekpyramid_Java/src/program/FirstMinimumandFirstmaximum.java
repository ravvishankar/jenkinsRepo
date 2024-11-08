package program;

public class FirstMinimumandFirstmaximum {
	public static void main(String[] args) {
		int[] a = { 5, 4, 2, 1, 3 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("The First Minimum: " + a[0]);
		System.out.println("The Second Minimum: " + a[1]);
		System.out.println("The First Maximum: " + a[a.length - 1]);
		System.out.println("The Second Maximum: " + a[a.length - 2]);
		int sum = 0;
		for (int k = 0; k < 3; k++) {
			sum = sum + a[k];
		}
		System.out.println("Total: " + sum);
		int multi = 1;
		for (int l = 0; l < 3; l++) {
			multi = multi * a[l];
		}
		System.out.println("Product value: "+multi);

	}

}
