import java.util.Scanner;
class chp1c{
	public static void main(String arg[]){
			int fact=1;
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			for(int i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println("Factorial="+fact);
	}
}