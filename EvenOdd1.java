//Write any program using if condition with for loop
//program:
import java.util.Scanner;
public class EvenOdd1
{
	public static void main(String args[])
	{
	System.out.println("Enter a number till you want even numbers: ");
	int n;
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for (int i=0;i<n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	}
	
}