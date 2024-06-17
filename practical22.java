class even extends Thread{
	public void run(){
		int i;
		for(i=0;i<=100;i++){
			if(i%2==0){
				System.out.println("Even no: "+i);
				try{
					sleep(1000);
				}catch(Exception e){
					System.out.println("Error");
				}
			}
		}
	}
}
class odd extends Thread{
	public void run(){
		int i;
		for(i=0;i<100;i++){
			if(!(i%2==0)){
				System.out.println("Odd no: "+i);
				try{
					sleep(1000);
				}catch(Exception e){
					System.out.println("Error");
				}
			}
		}
	}
}
class practical22{
public static void main(String arg[]){
even e=new even();
odd o=new odd();
e.start();
o.start();

}}