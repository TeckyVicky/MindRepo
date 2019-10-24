
public class FuncInt implements FunctionalInterface{

	@Override
	public void display() {
		System.out.println("InClass");
		
	}
	public static void main(String[] args) {
		FunctionalInterface fi = new FuncInt();
		fi.display();
		fi.display1();
	}

}
