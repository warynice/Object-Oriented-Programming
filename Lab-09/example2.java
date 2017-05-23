import java.awt.*;
import javax.swing.*;
class GUIgraphics extends JFrame {
	GUIgraphics() {
		super();
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();
	}
	public void paint(Graphics g) {
		g.drawRect(50, 50, 400, 300);
		g.drawOval(150, 150, 50, 50);
		g.drawLine(175, 200, 175, 275);
		g.drawLine(140, 225, 210, 225);
		g.drawLine(175, 275, 150, 325);
		g.drawLine(175, 275, 200, 325);
		g.setColor(Color.YELLOW);
		g.fillRect(250, 100, 100, 150);
		g.setColor(Color.ORANGE);
		g.fillOval(280, 110, 40, 30);
	}
	public static void main(String[] args) {
		GUIgraphics g1 = new GUIgraphics();
	}
}