import java.util.Scanner;
class SumEven{
 public static void main(String arg[]){
 Scanner sc=new Scanner(System.in);
 int n,result=0;
 System.out.println("Enter the no:");
 n=sc.nextInt();
 int i=1;
for(;i<=n;i++){
if(i%2==0){
result=n+i;
	}
}
System.out.println("Sum of the Even  noumbers is :"+result);
 sc.close();
 }
}