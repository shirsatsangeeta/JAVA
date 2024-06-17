import java.util.Scanner;
class MultiDimentionalArray{
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int[][] array=new int[3][3];
	//Taking input of the 3*3 matrix.
	for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print("Enter value at position: ["+(i+1)+"]["+(j+1)+"] : ");
		array[i][j]=sc.nextInt();
		System.out.print("\n");
	}
	}
	for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		System.out.print((array[i][j])+" ");
		}
		System.out.print("\n");
	}

	}
	}