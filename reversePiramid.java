import java.util.Scanner;
class reversePiramid{
	public static void main(String arg[]){
	 Scanner sc= new Scanner(System.in);
	 int n;
	 System.out.print("Enter the no: ");
		n=sc.nextInt();
	 for(int i=n;i>0;i--){
		for(int j=0;j<i;j++){
			System.out.print("* ");
		}
		System.out.print("\n");
	 }
	
	sc.close();
	}
}