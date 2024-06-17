import java.lang.String;
class StringClass{
	public static void main(String arg[]){
		  String s1="Hoola";
		  String s2="Amigo";
			System.out.println("Using Method 'toLowerCase()' :");
			System.out.println("String = "+s1);
			System.out.println("String in Lowercase :"+s1.toLowerCase());
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'toUpperCase()' :");
			System.out.println("String = "+s1);
			System.out.println("String in Uppercase :"+s1.toUpperCase());
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'trim()' :");
			String s3;
			s3="HE   LLO";
			System.out.println("String = "+s3);
			System.out.println("String trim :"+s3.trim());
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'replace()' :");
			System.out.println("String = "+s3);
			System.out.println("String replace is :"+s3.replace('L','P'));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'charAt()' :");
			System.out.println("String = "+s2);
			System.out.println("String character at position at 3 is :"+s2.charAt(3));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'equals()' :");
			String s4="Amigo";
			System.out.println("String = "+s1);
			System.out.println("String = "+s4);
			System.out.println("String comparison including cases :"+s1.equals(s4));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'equalsIgnoreCase()' : ");
			String s5="AMIGO";
			System.out.println("String = "+s1);
			System.out.println("String = "+s5);
			System.out.println("String comparison excluding cases :"+s1.equalsIgnoreCase(s4));
			
			
			System.out.println("\n");
			
			String s8="HOOLA";
			System.out.println("String = "+s1);
			System.out.println("String = "+s8);
			System.out.println("String comparison excluding cases :"+s1.equalsIgnoreCase(s8	));
			
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'compareTo()' : ");
			System.out.println("String = "+s1);
			System.out.println("String = "+s2);
			System.out.println("String comparison of length of the string with "+s1+" and "+s2+" : "+s1.compareTo(s2));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'concat()' : ");
			System.out.println("String = "+s1);
			System.out.println("String = "+s2);
			System.out.println("String Concatination is : "+s1.concat(s2));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'substring()' : ");
			String s6="Vinay Prakash More";
			System.out.println("String = "+s6);
			System.out.println("Sub String of String "+s6+" from 5 position : "+s6.substring(5));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'substring(n,m)' : ");
			//string s6="Vinay Prakash More";
			System.out.println("String = "+s6);
			System.out.println("Sub String of String "+s6+" from 5 to 13 position : "+s6.substring(5,13));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'indexOf()' : ");
			System.out.println("String = "+s4);
			System.out.println("Sub String of String "+s6+" from 5 position : "+s1.indexOf('g'));
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'indexOf()': ");
			System.out.println("String = "+s6);
			System.out.println("Sub String of String "+s6+" from 5 position : "+s1.indexOf('a',3));
			
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'valueOf()': ");
			System.out.println("String = "+s6);
			int a=10;
			String s=String.valueOf(a);
			System.out.println("This Method coverts given 10 into string.: "+s1.valueOf(s+10));

			System.out.println("\n\n");
			
			System.out.println("Using Method 'endsWith()': ");
			String s7 = new String("Saying Hello To This World.");
			boolean returnValue1;
			returnValue1=s7.endsWith("World.");
			System.out.println("Checking that the String "+s7+" Ends with World. : "+returnValue1);
			
			System.out.println("\n\n");
			
			System.out.println("Using Method 'startsWith()': ");
			boolean returnValue2;
			returnValue2=s7.startsWith("Saying");
			System.out.println("Checking that the String "+s7+" Starts with Saying : "+returnValue2);
	
			System.out.println("\n\n");
			
	}
}