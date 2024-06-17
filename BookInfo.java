class Book{
	String author;
	String title;
	double price;
	Book(String author,String title,double price){
		this.author=author;
		this.title=title;
		this.price=price;
	}
}
class BookInfo extends Book{
	int stockposition;
	BookInfo(String author,String title,double price,int stockposition){
		super(author,title,price);
		this.stockposition=stockposition;
	}
	public void display(){
		System.out.println("Author: "+author);
		System.out.println("Title: "+title);
		System.out.println("Price: "+price);
		System.out.println("Stock Position: "+stockposition);
	}
	public static void main(String arg[]){
		
		BookInfo b1=new BookInfo("vinay","new book",1200,13);
		b1.display();
		BookInfo b2=new BookInfo("vinay","new book",1203,12);
		b2.display();
		BookInfo b3=new BookInfo("vinay","new book",1205,15);
		b3.display();
	}
}