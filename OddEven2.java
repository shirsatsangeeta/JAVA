class A extends Thread {
	
	public void run() {
		
		for( i = 1;i <= 50; i = i + 2) {
			if(i == 5) {
				try {
				sleep(50);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			System.out.println("ODD: " + i);
		}
	}
}

class B extends Thread {	
	public void run() {
		for(int i = 0; i <= 50; i = i + 2) {
			System.out.println("EVEN: " + i);
		}
	}
}

public class OddEven2 {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();	
		a.start();
		b.start();
	}
}