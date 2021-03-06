package by.htp.task04.test3;

public class Test3 {
	private int a = 12;
	private int min = 0;
	private int max = 10;
	
	public Test3(int a) {
		this.a = a;
	} 
	
	public Test3() {
		this.a =  5;
	} 
	
	public void printer(int x) {
		System.out.println(x);
	}
	
	public int getA() {
		return a;
	}
	
	
	public int inkrement() {
		if (a<max) {
		return ++a;
		}
		return max;
	}
	
	public int dekrement () {
		if (a>min) {
			return --a;
			}
			return min;
	}
	
	public static void main(String[] asas) {
		Test3 test = new Test3();
		
		test.inkrement();
		test.printer(test.getA());
		test.dekrement();
		test.printer(test.getA());
		
		Test3 test2 = new Test3(10);
		
		test2.inkrement();
		test2.printer(test2.getA());
		test2.dekrement();
		test2.printer(test2.getA());
	}
}
