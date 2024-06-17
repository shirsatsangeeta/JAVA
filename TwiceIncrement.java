import java.util.Scanner;
class TwiceIncrementation{
 public static void main(String arg[]){
 Scanner sc=new Scanner(System.in);
 int n;
 System.out.println("Enter the no:");
 n=sc.nextInt();
for(int i=1;i<=n;i=i+2){
System.out.print(i+"\t");
	
}
 sc.close();
 }
}