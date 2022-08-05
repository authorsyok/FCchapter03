package ch10;

abstract class Car {
	abstract void drive();
	abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}

class AICar extends Car {

	@Override
	void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("������ ������ �ٲߴϴ�.");
	}

	@Override
	void stop() {
		System.out.println("������ ����ϴ�.");
	}
}

class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�");
	}

	@Override
	void stop() {
		System.out.println("�극��ũ�� ��Ƽ� �����մϴ�.");
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=====================");
		Car manualCar = new ManualCar();
		manualCar.run();
	}
}
