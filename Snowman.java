import javax.swing.JApplet;
import java.awt.Graphics;
public class Snowman extends JApplet 
{
	public void paint(Graphics pen)
	{
		pen.drawOval(100,50,200,200);
		pen.drawOval(75, 250, 250, 250);
		pen.drawOval(50, 500, 300, 300);
		
		pen.fillOval(175, 100, 10, 20);
		pen.fillOval(215, 100, 10, 20);
		pen.drawArc(125, 100, 150, 100, 180, 180);
	}
}
