import java.util.Scanner;
class practical3{
	public static void main(String arg[]){
		for(int i=0;i<999;i++){
			int n=i;
			int rem=0;
			int armstrong=0;
				while(n>0){
					rem=n%10;
					armstrong=(armstrong)+(rem*rem*rem);
					n=n/10;
				}
				if(armstrong == i){
					System.out.println(armstrong+" \t ");
				}
		}
	}
}