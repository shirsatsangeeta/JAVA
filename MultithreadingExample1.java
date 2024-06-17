class odd extends Thread 

{ 

public void run() 

{ 

for(int i=1;i<=20;i=i+2) 

{ 

System.out.println("ODD="+i); 

try 

{ 

sleep(1000); 

} 

catch(Exception e) 

{ 

System.out.println("Error"); 

} 

} 

} 

} 

class even extends Thread 

{ 

public void run() 

{ 

for(int i=0;i<=20;i=i+2) 

{ 

System.out.println("EVEN="+i); 

try 

{ 

sleep(1000); 

} 

catch(Exception e) 

{ 

System.out.println("Error"); 

} 

} 

} 

} 

class MultithreadingExample1 

{ 

public static void main(String arg[]) 

{ 

odd o=new odd(); 

even e=new even(); 

o.start(); 

e.start(); 

} 

} 