import java.util.Scanner;
class chp1{
public static void main(String arg[]){
	int n;
	int flag=0;
	System.out.println("Enter the no:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(int i=2;i<n;i++){
		if(n%i==0){
			flag =1 ;
		}
	}
	if(flag==1){
		System.out.println("The entered no is not a prime no:");
	}else{
		System.out.println("The entered no is a prime no:");
	}
}
}