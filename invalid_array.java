import java.util.Scanner;

class invalid_array{
public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
			int n,i;
			int[] array=new int[5];
				System.out.println("Enter the index no at which you want to insert the element: ");
				i=sc.nextInt();
				System.out.println("Enter the Element that you want to insert at the index"+i+" element: ");
				n=sc.nextInt();
				array[i]=n;
				
			
	}
}