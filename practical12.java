import java.util.*;
class practical12{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		Vector<Object> v=new Vector<>();
		Integer v1= Integer.valueOf(12);
		Integer v2=Integer.valueOf(12);
		String v3=new String("Hello");
		String v4=new String("World");
		Float v5=Float.valueOf(12.12f);
		Float v6=Float.valueOf(13.13f);	
		v.addElement(v1);
		v.addElement(v2);
		v.addElement(v3);
		v.addElement(v4);
		v.addElement(v5);
		v.addElement(v6);
		System.out.println("Elements of vector are: "+v);
		System.out.print("\n Enter the position of the Element to be removed: ");
		int n;
		n=sc.nextInt();
		v.removeElementAt(n-1);
		System.out.println("Elements of vector are: "+v);
	}
}