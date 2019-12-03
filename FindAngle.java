
public class FindAngle {

	public static void main(String[] args) {
		
		findAngle(7,20);

	}

	private static void findAngle(int h, int m) {
		
		int angle = (int) (((h*30)+(m*0.5))-(m*6));
		System.out.println(angle);
		
	}

}
