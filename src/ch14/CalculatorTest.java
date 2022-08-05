package ch14;

interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");		
		myMethod();
	}	
	static int total(int[] arr) {
		int total = 0;
		for(int i : arr) total += i;
		mystaticMethod();
		return total;
	}
	static void mystaticMethod() {System.out.println("private static method");}
	static void myMethod() {System.out.println("private method");}
}

abstract class Calculator implements Calc {
	public int add(int num1, int num2) {return num1 + num2;}
	public int sub(int num1, int num2) {return num1 - num2;}
	public int mul(int num1, int num2) {return num1 * num2;}
	public int div(int num1, int num2) {
		if(num2 == 0) return ERROR;
		else return num1 / num2;
	}
}
class CompleteCalc extends Calculator {
	public void showInfo() { System.out.println("모두 구현했다.");}
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
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
}
