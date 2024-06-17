import java.awt.*;
import java.applet.*;

public class practical25 extends Applet {
    public void paint(Graphics g) {
        // Draw a line from (10, 10) to (50, 50)
        g.drawLine(10, 10, 50, 50);

        // Draw an oval at (100, 100) with width 10 and height 10
        g.drawOval(100, 100, 10, 10);
    }
}
/*
<applet code="practical25.class"  width="500" height="500">
</applet>
*/

