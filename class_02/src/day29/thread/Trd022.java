package day29.thread;

public class Trd022 implements Runnable {

	@Override
	public void run() {
		display();
	}
	
	public void display() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("\t\t지우가 밥을 먹는다. : " + (i + 1));
		}
	}

}
