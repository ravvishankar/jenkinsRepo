package program;

public class FirstMinandMaxNumberUsingSingleForLoop {
	public static void main(String[] args) {
		int[]a= {5,4,0,2,1};
		int fmin=a[0];
		for (int i=0;i<a.length;i++) {
			if(fmin>a[i]) {
				fmin=a[i];
			}
		}
		System.out.println("The First Minimum no: "+fmin);
		int[]b= {5,4,0,2,1};
		int fmax=b[0];
		for (int i=0;i<b.length;i++) {
			if(fmin<b[i]) {
				fmin=b[i];
			}
		}
		System.out.println("The First Maximum no: "+fmax);
		
		
	}

}
