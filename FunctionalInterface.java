
public interface FunctionalInterface {
	void display();
	default void display1() {
		System.out.println("In Interface");
	}

}
