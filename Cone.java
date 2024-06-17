import java.io.*;
import java.awt.*;
import java.applet.*;

//<Applet code="Cone" WIDTH="800" HEIGHT="400"></Applet>


public class Cone extends Applet
{
   public void paint(Graphics g)
   {
     setBackground(Color.yellow);
     g.setColor(Color.black);

    /* To draw an cone*/
    g.drawOval(200,80,200,50);
    g.drawLine(200,100,300,500);
    g.drawLine(400,100,300,500);
 
    /* To draw a cyclinder*/
   g.drawOval(500,60,200,50);
   g.drawLine(500,80,500,300);
   g.drawLine(700,80,700,300);
   g.drawOval(500,280,200,50);

   /* To draw a cube*/
   g.drawRect(500,400,100,100);
   g.drawRect(550,450,100,100);
   g.drawLine(500,400,550,450);
   g.drawLine(500,500,550,550);
   g.drawLine(600,400,650,450);
   g.drawLine(650,550,600,500);

   }
}
