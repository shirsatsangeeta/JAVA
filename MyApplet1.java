import java.awt.*;
import java.applet.*;
public class MyApplet1 extends Applet 
{
	public void init()
	{
		System.out.println("Applet initialized");
	}
	public void start()
	{
		System.out.println("Applet execution started");
	}
	public void stop()
	{
		System.out.println("Applet execution stopped");
	}
	public void paint(Graphics g)
	{
		System.out.println("Painting...");
	}
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}
}
/*<applet code=MyApplet1.class height=200 width=200></applet>*/
