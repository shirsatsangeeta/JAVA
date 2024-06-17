import java.util.Scanner;

class RectangleAreaVolume{
	private double area,volume;
		public void AreaCalculate(int l,int b,int h){
			area=2*(l*b+b*h+h*l);
			System.out.println("Area = "+area+" square units" );
		}
		public void VolumeCalculate(int l,int b,int h){
			volume=l*b*h;
			System.out.println("Volume = "+volume+" cubic units" );
		}
}
class Room extends RectangleAreaVolume{
	Scanner sc=new Scanner(System.in);
		private int l,b,h;
			public void getdata(){
				System.out.print("\n Enter the Length of the rectangle: ");	
				l=sc.nextInt();
				System.out.print("\n Enter the Breadth of the rectangle: ");	
				b=sc.nextInt();
				System.out.print("\n Enter the Height of the rectangle: ");	
				h=sc.nextInt();
				sc.close();
			}
			public static void main(String arg[]){
				Room r1=new Room();
				r1.getdata();
				r1.AreaCalculate(r1.l,r1.b,r1.h);
				r1.VolumeCalculate(r1.l,r1.b,r1.h);
			}
		
}

