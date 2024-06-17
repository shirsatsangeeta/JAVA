import java.io.*; 
class NoMatchException extends Exception 
{ 
NoMatchException(String s) 
{ 
super(s); 
} 
} 
class Test7
{ 
	public static void main(String args[]) throws IOException { 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in) ); 
		System.out.println("Enter a word:"); 
		String str= br.readLine(); 
			try { 
				if (str.compareTo("MSBTE")!=0) // can be done with equals() 
					throw new NoMatchException("Strings are not equal"); 
				else 
					System.out.println("Strings are equal"); 
			} 
			catch(NoMatchException e) { 
					System.out.println(e.getMessage()); 
			} 
	} 
}