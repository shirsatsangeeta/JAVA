
class A extends Thread{
public void run(){
	int i;
for(i=0;i<=100;i++){
	try{
		if(i%2==0){
		System.out.println(i);
		sleep(1000);
	}
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}		
}
}
class B extends Thread{
	public void run(){
	int i;
for(i=0;i<=100;i++){
	try{
	if(i%2!=0){
		System.out.println(i);
		sleep(1000);
	}
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
}	
	}
}
class NewThread{
	public static void main(String arg[]){
			A a=new A();
			B b=new B();
			a.start();
			b.start();
	}
}