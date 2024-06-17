import java.awt.*;
import java.applet.*;
public class shapes1 extends Applet{
		int i;
	public void paint(Graphics g){

		g.drawString("i=" + i,100,100);
		try{
			Thread.sleep(1000);
			
		}catch(Exception e){
			
		}
	i++;
	repaint();
	   
	}
}
/*<applet code="shapes1.class" width="500" height="500"></applet>*/