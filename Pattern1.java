//Write any program to display pyramids of star/patterns using increment / decrement
//program:
import java.util.Scanner;
public class Pattern1
{
	public static void main(String args[])
	{
		System.out.println("Enter number of rows: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
			System.out.print("\n");
		}
	}
}