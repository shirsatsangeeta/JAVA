import java.util.Scanner;
class PalindromeNo{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int rem,rev,n,copy;
		rev=0;
		rem=0;
		System.out.println("Enter the no: ");
			n=sc.nextInt();
		copy=n;
		while(n>0){
		 rem=n%10;
		 rev=(rev*10)+rem;
		 n=n/10;
		}
		if(copy==rev){
		
		System.out.println("The No "+rev+" is a Palindrome no:");
		
		}
		else{
		
		System.out.println("The No "+rev+" is Not a Palindrome no:");
	
		}sc.close();
	
	}
}