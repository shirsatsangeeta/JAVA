class Constructor {
    int a, b;
    int result;

    Constructor() {
        a = 2;
		b = 11;
	}
    void addition() {
        result = a + b;
        System.out.println("Result: " + result);
    }
}

public class ConstructorMain {
    public static void main(String arg[]) {
        Constructor c1 = new Constructor();   
        c1.addition();
    }
}
