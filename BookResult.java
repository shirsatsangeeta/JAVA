import java.util.Scanner;
class Book{
	Scanner sc= new Scanner(System.in);
String author;
String tittle;
float price;
void getdata(){
	System.out.println("Enter the Author name:");
	author=sc.nextLine();
	System.out.println("Enter the Tittle name:");
	tittle=sc.nextLine();
	System.out.println("Enter the Price:");
	price=sc.nextFloat();
	
}
void putdata(){
	System.out.println("Author name:"+author);
	System.out.println("Tittle name:"+tittle);
	System.out.println("Price:"+price);
}
}
class BookInfo extends Book{
	int stockPosition;
	void input(){
	System.out.println("Enter the Stock Position:");
	stockPosition=sc.nextInt();	
	}
	void display(){
		System.out.println("Stock Position:"+stockPosition);
	
	}
}
class BookResult{
	public static void main(String arg[]){
			
			BookInfo b1=new BookInfo();
			b1.getdata();
			b1.input();
			b1.putdata();
			b1.display();
	}
}