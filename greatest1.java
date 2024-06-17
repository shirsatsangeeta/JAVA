import java.util.Scanner;
class greatest1{
public static void main(String arg[]){

Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("Enter the first no: ");
a=sc.nextInt();
System.out.println("Enter the Second no:");
b=sc.nextInt();
System.out.println("Enter the Third no :");
c=sc.nextInt();
int x;
x=(a>b)?((a>c)?a:c):((b>c)?b:c);
System.out.println("The Greatest no is :"+x);



}

}