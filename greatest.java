import java.util.Scanner;
class greatest{
public static void main(String arg[]){
Scanner sc= new Scanner (System.in);
int no1,no2,no3;
System.out.println("Enter the First no: ");
no1=sc.nextInt();
System.out.println("Enter the Second no: ");
no2=sc.nextInt();
System.out.println("Enter the Third no: ");
no3=sc.nextInt();
if(no1>no2 && no1>no3){

System.out.println("First no: "+no1+" is greatest no:");

}
else if(no2>no3){

System.out.println("Second no : "+no2+" is greatest no:");

}
else{

System.out.println("Third no :" +no3+" is greatest no:");

		}
	}
}