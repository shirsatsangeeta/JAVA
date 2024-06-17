import java.applet.*;
import java.awt.*;
public class practical26 extends Applet{
	
	public void paint(Graphics g){
		int x[]={10,200,100,10};
		int y[]={10,10,100,10};
		int n=4;
		g.setColor(Color.red);
		g.fillPolygon(x,y,n);
	}
}
/*<html>
<applet code="practical26.class" width="500" height="500"></applet>
</html>
*/