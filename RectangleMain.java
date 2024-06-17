import java.util.Scanner;
interface Area{
	void RectangleGetdata();
	void AreaCalculate();
	void AreaDisplay();
	
}
interface Perimeter{
	void RectangleGetdata();
	void PerimeterCalculate();
	void PerimeterDisplay();
}
class Rectangle implements Area, Perimeter{
 private double l;
private double b;
private double perimeter;
private double Area;
Scanner sc= new Scanner(System.in);
	@Override
public	void RectangleGetdata(){
		System.out.print("\n Enter the Length:");
		l= sc.nextDouble();
		System.out.print("\n Enter the Breadth:");
		b= sc.nextDouble();
			sc.close();
	}
	@Override
public	void AreaCalculate(){
		Area=l*b;
	}
	@Override
public	void PerimeterCalculate(){
		perimeter=2*(l+b);
		
	}
	@Override
public	void AreaDisplay(){
		System.out.println("\n Area of Rectangle: "+Area);
	}
	@Override
public	void PerimeterDisplay(){
		System.out.println("Area of Rectangle: "+perimeter);
	}

}
class RectangleMain{
	public static void main(String arg[]){
		Rectangle r1=new Rectangle();
		r1.RectangleGetdata();
		r1.AreaCalculate();
		r1.PerimeterCalculate();
		r1.AreaDisplay();
		r1.PerimeterDisplay();
		
	}
}