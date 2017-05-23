import java.awt.*;
import javax.swing.*;
public class flag extends JFrame {
	flag() {
		super();
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(150, 50, 10, 350);
		g.fillOval(100, 400, 100, 50);
		g.setColor(Color.RED);
		g.fillRect(160, 70, 120, 30);
		g.setColor(Color.WHITE);
		g.fillRect(160, 100, 120, 30);
		g.setColor(Color.GREEN);
		g.fillRect(160, 130, 120, 30);
		g.setColor(Color.BLUE);
		double x = 220;
		double y = 115;
		double r = 15;
		g.drawOval(205,100,30,30);
		int i = 0;
		while(i <= 360) {
			double x1 = x + (double)r*Math.cos(i*Math.PI/180);
			double y1 = y + (double)r*Math.sin(i*Math.PI/180);
			g.drawLine((int)x, (int)y, (int)x1, (int)y1);
			i += 24;
		}
	}
	public static void main(String[] args) {
		flag f = new flag();

	}
}