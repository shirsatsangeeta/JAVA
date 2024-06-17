import java.util.Scanner;
class practical5{
	public static void main(String arg[]){
		int n;
		int rem=0,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the No:");
		n=sc.nextInt();
		while (n>0){
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(" Reverse no is: "+rev);
	}
}