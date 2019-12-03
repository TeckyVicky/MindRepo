import java.util.Arrays;

public class LeastDifference {

	public static void main(String[] args) {
		int a[] = {2,12,6,9,45,78,56,10};
		
		Arrays.sort(a);
		System.out.println("Max Difference: "+ (a[a.length-1]-a[0]));
		leastDiff(a);
	}

	private static void leastDiff(int[] a) {
		int min = 2;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				int diff = a[j]-a[i];
				if(diff<min){
					min=diff;
				}
			}
		}
		
		System.out.println("Least Difference : " + min);
		
	}

}
