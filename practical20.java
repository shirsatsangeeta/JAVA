import java.io.*;
class NoMatchException extends Exception{
	NoMatchException(String str1){
		super("String is "+str1);
	}
}
class practical20 {
	public static void main(String arg[]){	
	String str1="India";
	String str2="Dubai";
	try{
		if(!(str1.equals("India"))){
			throw new NoMatchException(str1);
		
	}else {
		System.out.println("String 1 is "+str1);
	}
	}catch(Exception e){
		System.out.println("Caught "+e);
		
	}
	try{
		if(!(str2.equals("India"))){
			throw new NoMatchException(str2);
		
	}else {
		System.out.println("String 2 is  "+str2);
	}
	}catch(Exception e){
		System.out.println("Caught "+e);
		
	}
	}
}