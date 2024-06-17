/*
<applet code="SetBackgroundColorExample" width=200 height=200>
</applet>
*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class SetBackgroundColorExample extends Applet
{
public void paint(Graphics g) {
/*
* Set background color of an applet using
* void setBackground (Color c) method.
*/
setBackground(Color.red);
}
}