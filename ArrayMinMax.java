
public class ArrayMinMax {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 5, 8, 12, 12, 2, 0, 0 };

		int min = a[0];
		int max = a[0];
		int secMax = a[0];
		int secMin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				secMax = max;
				max = a[i];
			}	
			
			if (min > a[i]) {
				secMin = min;
				min = a[i];
			}
		}
		System.out.println("Max is : " + max);
		System.out.println("min is : " + min);
		System.out.println("secMax is : " + secMax);
		System.out.println("secMin is : " + secMin);
	}

}
