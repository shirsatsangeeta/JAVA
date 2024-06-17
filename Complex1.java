import java.util.Scanner;
class Complex1{
	void addition(int real1,int img1, int real2,int img2){
		int realsum=real1+real2;
		int imgsum=img1+img2;
		System.out.println(" \n Addition = "+realsum+" + "+imgsum+"i");
	}
	void difference(int real1,int img1, int real2,int img2){
		int realsub=real1-real2;
		int imgsub=img1-img2;
		System.out.println(" \n Difference = "+realsub+" - "+imgsub+"i");
	}
	void product(int real1,int img1, int real2,int img2){
		int realmul=real1*real2;
		int imgmul=img1*img2;
		System.out.println(" \n Product = "+realmul+" * "+imgmul+"i");
	}
	public static void main(String arg[]){
			int real1,img1;
			int real2,img2;
			Scanner sc=new Scanner(System.in);
			System.out.print(" \n Enter the Real part of the First Complex no: ");
				real1=sc.nextInt();
			System.out.print(" \n Enter the Imaginary part of the First Comaplex no: ");
				img1=sc.nextInt();
			System.out.print(" \n Enter the Real part of the Second Complex no: ");
				real2=sc.nextInt();
			System.out.print(" \n Enter the Imaginary part of the Second Comaplex no: ");
				img2=sc.nextInt();
			Complex1 c1= new Complex1();
			c1.addition(real1,img1,real2,img2);
			c1.difference(real1,img1,real2,img2);
			c1.product(real1,img1,real2,img2);
			sc.close();
	}
}