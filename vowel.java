import java.util.Scanner;

class vowel{

public static void main(String arg[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Character : ");
char n=sc.next().charAt(0);
switch (n){
	
	case 'a':
		case 'e':
	

		case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
		case 'I':

	case 'O':
	case 'U':
	System.out.println("The entered character is a Vowel: ");
	break;
	default:
		System.out.println("The entered character is a Consonent: ");


}
sc.close();

}
}