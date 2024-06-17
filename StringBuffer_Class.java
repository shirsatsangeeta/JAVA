import java.lang.String;
class StringBuffer_Class{
	public static void main(String arg[]){
	
	System.out.print("\n\n");
	
		System.out.println("Using method 'Append();' : ");
		StringBuffer s1=new StringBuffer("Vinay ");
		System.out.println("Original String: "+s1);
		System.out.println("Appending String: 'More' : ");
		s1.append("More");	
		System.out.println("String after Appending is :"+s1);
	
	System.out.print("\n\n");
	
		System.out.println("Using method 'Insert();' : ");
		StringBuffer s2=new StringBuffer("Opponent.");
		System.out.println("Original String : "+s2);
		System.out.println("Inserting String: 'xyz' : ");
		s2.insert(9,"xyz");	
		System.out.println("String after inserting is : "+s2);
	
	System.out.print("\n\n");
	
		System.out.println("Using method 'replace();' : ");
		StringBuffer s3=new StringBuffer("HELLO JAVA ");
		System.out.println("Original String: "+s3);
		System.out.println("Replace String: 'JAVA' with 'Vinay.' : ");
		s3.replace(6,10,"Vinay.");	
		System.out.println("String after Replacing is :"+s3);

	System.out.print("\n\n");
	
		System.out.println("Using method 'reverse();' : ");
		StringBuffer s4=new StringBuffer("HELLO WORLD. ");
		System.out.println("Original String: "+s4);
		System.out.println("reversing String : "+s4);
		s4.reverse();	
		System.out.println("String after Reversing is :"+s4);
	
	System.out.print("\n\n");
	
		System.out.println("Using method 'delete();' : ");
		StringBuffer s5=new StringBuffer("We are Welcome to Vidyalankar Polytechnic. ");
		System.out.println("Original String: "+s5);
		System.out.println("Deleting the String from index '0' to '6': "+s5);
		s5.delete(0,6);
		System.out.println("String after Deleting is :"+s5);
	
	System.out.print("\n\n");
		
		System.out.println("Using method 'setCharAt();' : ");
		StringBuffer s6=new StringBuffer("Vinyy Prakash More. ");
		System.out.println("Original String: "+s6);
		System.out.println("Inserting character 'a' at position '3' : ");
		s6.setCharAt(3,'a');	
		System.out.println("String after using the 'setCharAt()' function is :"+s6);
	
	System.out.print("\n\n");
		
		System.out.println("Using method 'deleteCharAt();' : ");
		StringBuffer s7=new StringBuffer("Happpy New year.");
		System.out.println("Original String: "+s7);
		System.out.println("Deleting char 'p' from the String : ");
		s7.deleteCharAt(2);	
		System.out.println("String after Deleting character is :"+s7);
	
	System.out.print("\n\n");
		
		System.out.println("Using method 'setLength(n);' : ");
		StringBuffer s8=new StringBuffer("JAVA Programing is called as the truely object oriented programing. ");
		System.out.println("Original String: "+s8);
		System.out.println("Setting String to Length '16' :");
		s8.setLength(16);	
		System.out.println("String after Setting the length to '16' is :"+s8);
	
	System.out.print("\n\n");
	
	}
}