package ch11;

interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
}

abstract class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
}

class CompleteCalc extends Calculator {

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 == 0) return ERROR;
		else return num1 / num2;
	}
}

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.sub(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" + calc.mul(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.div(num1, num2));
	}
}
