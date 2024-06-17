import java.awt.*;
import java.applet.*;
public class shapes extends Applet
{
public void paint(Graphics g)
{
g.setFont(new Font("Arial",10, 12));
g.drawString("Types of Shapes",150,10);
g.drawLine(20,20,60,60);
g.drawRect(20,70,50,40);
g.setColor(Color.orange);
g.fillOval(100,30,40,90);
g.fillRoundRect(30,140,70,40,10,10);
g.fillArc(100,130,90,50,190,190);
}
}
/*<applet code=shapes height=300 width=300>
</applet>
*/