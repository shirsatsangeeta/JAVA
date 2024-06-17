import java.util.Scanner;
class practical4{
	public static void main(String arg[]){
		int n,flag=0;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number:");
			n=sc.nextInt();
			
			for(int i=2;i<n;i++){
				if(n%i==0){
					flag =1;
				}
			}
			if(flag==1){
				System.out.println("The Entered no is not a Prime no:");
			}
			else{
				System.out.println("The Entered no is an Prime no:");
			}
	}
}