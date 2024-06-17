import java.util.Scanner;
class piramid{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n,i,j;
				System.out.println("Enter the no: ");
				n=sc.nextInt();
for(i=0;i<n;i++){
	
		for(j=0;j<=n-i;j++){
			System.out.print(" ");
	
		}
		for(int k=0;k<=i;k++){
			System.out.print("* ");
	
		}
	System.out.print("\n");
}

	sc.close();
	}
}