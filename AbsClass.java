
public abstract class AbsClass  {
	AbsClass(){
		System.out.println("Hi AbsClass Constructor");
	}

	public void print() {
		System.out.println("In Abstract");
	}
	abstract void print1();
	
	public static void main(String[] args) {
		AbstractEx a = new AbstractEx();
		a.print();
		a.print1();
	}
	
}
class AbstractEx extends AbsClass{
	
	AbstractEx(){
		System.out.println("Hi AbstractEx Constructor");
	}
	@Override
	void print1() {
		System.out.println("In Non Abstract");
		
	}
	
}
