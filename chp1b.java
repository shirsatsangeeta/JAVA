import java.util.Scanner;
class chp1b{
	public static void main(String arg[]){
		int n;
		int rem=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		n=sc.nextInt();
		while(n>0){
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("Total="+sum);
	}
}