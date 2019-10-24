
public class Test {

	public static void main(String[] args) {
		Integer n=10;
		int sum = 0;
		String str[] = {"1b22","1n22","1g22","123","12Ab3"};
		for(int i=0; i<str.length; i++) {
			char c[] = str[i].toCharArray();
			for(int j=0; j<c.length; j++) {
				if(c[j] >= 49 && c[j] <= 57) {
				 sum = sum + (c[j]-48);
				 System.out.println(c[j]);
				}
			}
		}
		System.out.println(sum);
		
	}
}

