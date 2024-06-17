import let_me_calculate.Calculator;
	public class Demo {
		public static void main(String[] args) {
			Calculator calc = new Calculator();
			int num1 = 5;
			int num2 = 7;
			int sum = calc.add(num1, num2);
			System.out.println("The sum is: " + sum);
		}
}
