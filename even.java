import java.util.Scanner;

class even{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int number;
System.out.println("Enter the no: ");
number=sc.nextInt();
if (number%2 == 0) {
System.out.println("Number is Even.");
}
else{
System.out.println("Number is Odd.");
}
}
}
