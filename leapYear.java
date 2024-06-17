import java.util.Scanner;

class leapYear{
public static void main(String arg[]){
Scanner sc = new Scanner (System.in);
int n;
System.out.println("Enter the year");
n=sc.nextInt();
if(n%400==0) {
	
	System.out.println(n+" Is a leap Year. ");
	
}
if(n%4==0 && n%100!=0){
	
	System.out.println(n+" Is a leap Year. ");
	
}
else {
	
System.out.println(n+" Is not a leap Year. ");
	
	
}
}

}