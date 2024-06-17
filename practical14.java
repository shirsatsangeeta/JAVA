import java.util.Scanner;
class practical14{
		public static void main(String arg[]){
				int array[]=new int[100];
				int n;
				Scanner sc=new Scanner(System.in);
				System.out.print(" \n Enter the no of elements: ");
				n=sc.nextInt();
				System.out.print(" \n Enter the Elements of the Array: ");
				for(int i=0;i<n;i++){
					array[i]=sc.nextInt();
				}
				for(int i=0;i<n-1;i++){
					for(int j=0;j<n-1-i;j++){
						if(array[j]>array[j+1]){
							int temp = array[j+1];
							array[j+1]=array[j];
							array[j]=temp;
						}
					}
				}
				System.out.print(" \n Sorted Elements of array are: ");
				for(int i=0;i<n;i++){
					System.out.print(array[i]+" ");
				}
		}
}