import java.awt.*;
import java.applet.*;
public class polygon extends Applet
{
public void paint(Graphics g)
{

int xpoints[]={30,200,30,200,30}; 
int ypoints[]={30,30,200,200,30}; 
int num=5; 
g.drawPolygon(xpoints,ypoints,num); 

}
}

/*<applet code=polygon.class height=300 width=300>
</applet>
*/