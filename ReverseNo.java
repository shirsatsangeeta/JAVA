import java.util.Scanner;
class ReverseNo{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int rem,rev,n;
		rev=0;
		rem=0;
		System.out.println("Enter the no: ");
			n=sc.nextInt();
		while(n>0){
		 rem=n%10;
		 rev=(rev*10)+rem;
		 n=n/10;
		}
		System.out.println("The Reverse No is : "+rev);
		sc.close();
	
	}
}