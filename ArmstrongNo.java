import java.util.Scanner;
class ArmstrongNo{
public static void main(String arg[])
	{
	for(int i=0;i<=999;i++){
	int rem=0,sum=0,cube=0; 
		int n=i;
		while(n>0)
		{
		rem=i%10;
		cube=cube+(rem*rem*rem);
		n=n/10;
		}
		if(i==cube){
		System.out.print(cube+"\t");
	    
		}
		}
	}
}