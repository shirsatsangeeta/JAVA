import java.util.Scanner;

import java.io.*;
class InvalidException extends Exception{
	InvalidException(String str1){
		super(str1);
	}
}
class practical21{
	public static void main(String arg[]){
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age:");
		age=sc.nextInt();
		try{
			if(age<18){
				throw new InvalidException("Invalid Age");
			}
			else{
				if(age>=18){
					System.out.println("Eegible for voting:");
				}else{
					System.out.println("Not Eegible for voting:");
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}