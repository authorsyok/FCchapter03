package ch10;

abstract class Car {
	abstract void drive();
	abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
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
		System.out.println("자율 주행합니다.");
		System.out.println("스스로 방향을 바꿉니다.");
	}

	@Override
	void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}

class ManualCar extends Car {

	@Override
	void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	void stop() {
		System.out.println("브레이크를 밟아서 정지합니다.");
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
