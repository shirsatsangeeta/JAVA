import java.applet.*;
import java.awt.*;
public class Smiley extends Applet {
    public void paint(Graphics g)
    {
        // Oval for face outline
        g.drawOval(83, 70, 160, 160);
 
        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 30, 30);
        g.fillOval(180, 120, 30, 30);
  g.setColor(Color.white);
   g.fillOval(123, 123, 15, 15);
   g.fillOval(183, 123, 15, 15);
        // Arc for the smile
		 g.setColor(Color.BLACK);
        g.drawArc(140, 180, 50, 20, 180, 180);
    }
}
/*<applet code=Smiley.class height=300 width=300>
</applet>*/