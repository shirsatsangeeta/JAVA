class A extends Thread{
	public void run(){
		int i;
		for(i=1;i<50;i++){
			try{
			if(i%2==0){
				System.out.println("Even= "+i);
			}
			if(i%6==0){
				sleep(50);
			}
			}catch(Exception e){
				System.out.println("Error");
			}
		}
	}
}
class B extends Thread{
	public void run(){
		int i;
		for(i=3;i<50;i++){
			try{
				if(i%2!=0){
						System.out.println("Odd= "+i);
				}
			}catch(Exception e){
				System.out.println("Error");
			}
		}
	}
}
class practical24{
	public static void main(String arg[]){
		A a=new A();
		B b=new B();
		a.start();
		b.start();
	}
}