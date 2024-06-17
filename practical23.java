import java.util.Scanner;
class NoMatchException extends Exception{
	NoMatchException(String str1){
	super(str1);
	}
}
class practical23{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password:");
		String str1=sc.nextLine();
		try{
			if(!(str1.equals("MSBTE"))){
				throw new NoMatchException ("Invalid Password..");
			}
			else{
				System.out.println("Login Sucessfully.");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}