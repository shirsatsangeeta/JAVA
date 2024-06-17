import java.util.Scanner;
class EvenOdd{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no : ");
			int n;
			n=sc.nextInt();
			for(int i=0;i<=n;i++){
			if(i%2==0){
				System.out.println(i+" is Even no: ");
				}
			else{
				System.out.println(i+" is Odd no: ");
				}
			}
		sc.close();
		}
		}