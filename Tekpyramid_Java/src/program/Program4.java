package program;

public class Program4 {
	public static void main(String[] args) {
		int [] a= {5,3,6,7,4,8,3,9,2};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==11) {
					System.out.println(a[i]+"+"+a[j]+"=11");
				}
				
			}
			
		}
		
		
	}

}
