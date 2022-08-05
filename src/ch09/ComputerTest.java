package ch09;

abstract class Computer {
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

class DeskTop extends Computer {

	@Override
	void display() {
		System.out.println("DeskTop display");
	}
	
	void typing() {
		System.out.println("DeskTop typing");
	}
	
	@Override
	public void turnOff() {
		System.out.println("DeskTop turnOff");
	}
	
}

abstract class NoteBook extends Computer {

	@Override
	void typing() {
		System.out.println("NoteBook typing");
	}
}

class MyNoteBook extends NoteBook {

	@Override
	void display() {
		System.out.println("MyNoteBook display");
	}
	
}

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		NoteBook myNote = new MyNoteBook();
	}
}
