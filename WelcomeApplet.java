import java.awt.*;
import java.applet.*;

public class WelcomeApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Welcome to Java", 100, 100);
    }
}
/* <html>
<applet code="WelcomeApplet.class" height=500 width=700>
     </applet>
</html>
*/