class NoMatchException extends Exception{
NoMatchException(String str){
	super(str);
}
}
class ExceptionNoMatch{
	public static void main(String arg[]){
			String str1="India";
			String str2="Dubai";
			try{
				if(!(str1.equals("India"))){
					throw new NoMatchException(str1);
				}
				else{
					System.out.println("String1 is valid:");
				}
				if(!(str2.equals("India"))){
					throw new NoMatchException(str2);
				}
				else{
					System.out.println("String2 is valid:");
				}

			}catch(Exception e){
				System.out.println(e.getMessage());
			}
	}
}