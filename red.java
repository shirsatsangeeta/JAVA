	import java.applet.*;
	import java.awt.*;
	public class red extends Applet{
		public void paint(Graphics g){
			int x[]={10,100,50,10};
			int y[]={10,10,100,10};
			int n=4;
			g.setColor(Color.red);
			g.fillPolygon(x,y,n);
		}
	}
	/*<applet code="red.java" width="200" height="200"></applet>*/