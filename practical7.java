import java.util.Scanner;
class practical7{
	public static void main(String arg[]){
		int n;
		int array[]=new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the no of Elements: ");
		n=sc.nextInt();
		System.out.print("\n Enter the Elements of array: ");
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				if(array[j]>array[j+1]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.print("\n Sorted Elements Are:");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+ " ");
		}
	}
}