package Practice.Calculator;

public class CalculatorOps {
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int subtract(int x, int y) {
		return x-y;
	}
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	
	public static int divide(int x, int y) {
		if(y==0) {
			throw new ArithmeticException("Divide by Zero Exception");
		}
		return x/y;
	}
}
