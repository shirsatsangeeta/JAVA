import java.util.Scanner;
class practical2{
	public static void main(String arg[]){
		float balance=0,withdrawAmount=0,DepositeAmount=0;
		int n=0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Enter Your Choice: \n 1. To Withdraw money: \n 2. To Deposite Money: \n 3. To Check Balance: \n 4. To Exit");
			n=sc.nextInt();
			switch(n){
				case 1: 
					System.out.println("Enter the Amount to be Withdraw: ");
					withdrawAmount=sc.nextFloat();
						if(withdrawAmount>balance){
							System.out.println("The Withdraw Amount is more than the Balance Amount:");
						}
						else if(withdrawAmount<0){
							System.out.println("You can't enter a negative value.");
						}
						else{
							balance-=withdrawAmount;	
						}
				break;
				
				case 2:
					System.out.println("Enter the Amount to be Deposited:");
					DepositeAmount=sc.nextFloat();
					if(DepositeAmount<0){
						System.out.println("You can't enter a negative value. ");
					}
					else{
						balance+=DepositeAmount;
					}
				break;
				
				case 3:
					System.out.println("Balance: "+balance);
				break;
				
				case 4:
					System.exit(0);
				break;
				
				default:
					System.out.println("Enter a valid choice: ");
					
			}
		}while(n!=4);
		
	
	}
}