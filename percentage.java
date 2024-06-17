import java.util.Scanner;
class 	percentage{
	public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Percentage: ");
	double per;
	per=sc.nextDouble();
	int flag=0;
	if(per<=100 && per >75){
	
	flag=1;
	}
	else if(per<=75 && per >65){
	
	flag=1;
	}
	
	else if(per<=65 && per >=40){
	
	flag=2;
	}

	else if(per<40 && per >=0){
	
	flag=3;
	}
	switch(flag){
			case 1:
			System.out.println("Passed with  Distinction:");
			break;
			case 2: 
			System.out.println("Passed with First Class: ");
			break;
			case 3:
			System.out.println(" Failed ");
			break;
			default:
				System.out.println("Entrer the valid input:");
	}
	
	
	sc.close();
	}
}