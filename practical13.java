import java.lang.*;
import java.io.*;
import java.util.Scanner;
class practical13{
	public static void main(String arg[]){
			String str1;
			Scanner sc=new Scanner(System.in);
			System.out.print(" \n Enter the String:");
			str1=sc.nextLine();
			String rev="";
				int n=str1.length();
				for(int i=n-1;i>=0;i--){
					rev=rev+str1.charAt(i);
				}
				if(str1.equals(rev)){
					System.out.println("The String is An Palindrom.");
				}
				else{
					System.out.println("the String is not an Palindrome.");
				}
	}
}