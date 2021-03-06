package by.htp.task04.test1;

public class Test1 {
	private int a = 12;
	private int b = 2;
	
	public void printer(int x) {
		System.out.println(x);
	}
	
	public void sum() {
		int sum;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int max() {
		
		if (a>b) {
			return a;
			}
			else {
				return b;
			}
		}
	
	public static void main(String[] asas) {
		Test1 test = new Test1();
		
		test.printer(5);
		test.printer(test.a);
		test.setA(10);
		test.printer(test.a);
		test.printer(test.max());
	}
}
