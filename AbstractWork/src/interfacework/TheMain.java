package interfacework;

public class TheMain implements InterfaceA,InterfaceB{
	
	public static void main (String []args) {
		
		TheMain tm = new TheMain();
		
		tm.method1();
		tm.method2();
		
	}

	@Override
	public void method2() {
		System.out.println("Thank You!");
		
	}

	@Override
	public void method1() {
		System.out.println("It has been a pleasure");
		
	}

}
