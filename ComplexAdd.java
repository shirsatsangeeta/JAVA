class Complex{
	int real,imag;
	
		Complex(){
			real=0;
			imag=0;
		}
		Complex(int x,int y){
			this.real=x;
			this.imag=y;
		}
		Complex(Complex obj){
			this.real=obj.real;
			this.real=obj.imag;
		}
		Complex  add(Complex obj){
			Complex result =new Complex();
			result.real=this.real+obj.real;
			result.imag=this.imag+obj.imag;
			return result;
		}
		void display(){
			System.out.println(real+" + "+imag+"i");
		}
}
class ComplexAdd{
	public static void main(String arg[]){
		Complex c1= new Complex();
		Complex c2= new Complex(2,4);
		Complex c3= new Complex(c2);
		Complex sum=c1.add(c2);
		sum.display();
	}
}