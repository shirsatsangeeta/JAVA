import java.util.Scanner;
class chp1a{
	public static void main(String arg[]){
		Scanner sc= new Scanner(System.in);
		int flag ;
		System.out.println("Ennter the range: ");
		int r=sc.nextInt();
		for(int i=3;i<r;i++){
			flag=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag =1;
					break;
				}	
			}
			if(flag==0){
				System.out.println(i);
				
			}
		}
	}
}