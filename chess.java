import java.awt.*;
import java.applet.*;
public class chess extends Applet{
	int n=10;
	public void paint(Graphics g){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if((i%2==0)==(j%2==0)){
					g.setColor(Color.black);
					g.fillRect(i*20,j*20,20,20);
				}else{
					g.setColor(Color.white);
					g.fillRect(i*20,j*20,20,20);
				}
				
			}
		}
	}
	
}
/*<applet code="chess.class" width="500" height="500"></applet>*/