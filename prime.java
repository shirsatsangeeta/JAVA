import java.util.Scanner;
class prime{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int n,flag=0;
	System.out.println("Enter the no:");
	n=sc.nextInt();
	for(int i=2;(i<n)&&(i>-1);i++){
		if (n%i==0){
			flag = 1;
			break;
		}
	}
	if(flag==0){
			if(n==1||n==0){
				System.out.println("Entered no "+n+" is neither prime neither composite.");
				}
			else{
				if(n<0){
			System.out.println("Entered no "+n+" is not a prime no");		
				}
				else{
				System.out.println("Entered no "+n+" is a prime no");
				}
			}
	}
	else{
		System.out.println("Entered no "+n+" is not a prime no");
	}
	sc.close();
}
}