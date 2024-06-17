import java.util.Scanner;
class week{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number from (1-7) to print the day fo the week: ");
n=sc.nextInt();
switch(n){
case 1:
	System.out.println(" Monday");

case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
		break;
case 4:
	System.out.println("Thursday");
		break;
case 5:
	System.out.println("Friday");

	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
	System.out.println("Incorrect value");

}
}

}