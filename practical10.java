import java.util.Scanner;
class practical10{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
			int n;
			
			System.out.print(" \n Enter the no of elements: ");
			n=sc.nextInt();
			int array1[]=new int[n];
			System.out.print(" \n Enter the Elements of First array:");
			for(int i=0;i<n;i++){
				array1[i]=sc.nextInt();
			}
			int array2[]=new int[n];
			for(int i=0;i<n;i++){
				array2[i]=array1[i];
			}
			System.out.print(" \n The Elements of Second array are:");
			for(int i=0;i<n;i++){
				System.out.print(array2[i]+"\t");
			}
	}
}