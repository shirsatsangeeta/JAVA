class Factorial{
int a,fact=1;
Factorial(int x){
a=x;
}
void fact1(){
for(int i=1;i<=a;i++){
	fact=fact*i;

}
System.out.println("Factorial = "+fact);
}
}
public class ParameterizedExample {
	public static void main(String arg[]){
		Factorial f1 = new Factorial(5);
		f1.fact1();
	}
}