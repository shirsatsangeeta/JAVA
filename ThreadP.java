class TL extends Thread {
    public void run() {
        System.out.println("This is Thread1 class");
    }
}
class T2 extends Thread {
    public void run() {
        System.out.println("This is Thread2 class");
    }
}
public class ThreadP {
    public static void main(String args[]) {
        TL t1 = new TL(); 
        T2 t2 = new T2(); 
		t1.setPriority(Thread.MIN_PRIORITY); 
        t2.setPriority(Thread.MIN_PRIORITY); 
        t1.start(); 
        t2.start(); 
    }
}
