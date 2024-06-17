import java.awt.*;
import java.applet.*;
import java.util.Scanner;
public class Barchart1 extends Applet
{
String label[];
int  values[];
int n=0;
public void init()
{
	Scanner sc= new Scanner(System.in);
try
{
n=sc.nextInt(getParameter("cols"));
label=new String[n];
values=new int[n];
label[0]=getParameter("label1");
label[1]=getParameter("label2");
label[2]=getParameter("label3");
label[3]=getParameter("label4");
values[0]=sc.nextInt(getParameter("values1"));
values[1]=sc.nextInt(getParameter("values2"));
values[2]=sc.nextInt(getParameter("values3"));
values[3]=sc.nextInt(getParameter("values4"));
}
catch(Exception e){  
	System.out.println("Caught Exception: " +e);
}
}
public void paint(Graphics g)
{
g.setColor(Color.red);
for(int i=0;i<n;i++)
{
g.drawString(label[i],100,100+i*50);
g.fillRect(150,80+i*50,values[i],40);
}
}
}

/* <html>
<applet code="barChart.class" height=500 width=700>
	<param name="cols" value="4">
	<param name="label1" value="2001">
	<param name="label2" value="2002">
	<param name="label3" value="2003">
	<param name="label4" value="2004">

	<param name="values1" value="96">
	<param name="values2" value="85">
	<param name="values3" value="70">
	<param name="values4" value="98">
     </applet>
</html>
*/
