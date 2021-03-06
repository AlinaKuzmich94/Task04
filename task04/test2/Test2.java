package by.htp.task04.test2;

public class Test2 {
	private int a = 12;
	private int b = 2;
	
	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	} 
	
	public Test2() {
		this.a = 13;
		this.b = 3;
	} 
	
	public void printer(int x) {
		System.out.println(x);
	}

	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public static void main(String[] asas) {
		Test2 test = new Test2(14, 4);
		
		test.printer(5);
		test.printer(test.a);
		test.setA(10);
		test.printer(test.a);
	}
}
