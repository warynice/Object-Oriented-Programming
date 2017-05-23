class Point {
	private double x;
	private double y;
	Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	public static void changeState(Point other) {
		other.x =- 20;
		other.y =- 20;
	}
	public static void changeDestination(Point other) {
		other = new Point(-20,-20);
	}
	public String toString() {
		return "x= " + this.x + " y= " + this.y;
	}
}
public class example6 {
	public static void main(String[] args) {
		Point p1 = new Point(4,16);
		System.out.println(p1);
		Point.changeState(p1);
		System.out.println(p1);
		Point p2 = new Point(16,0);
		System.out.println(p2);
		Point.changeDestination(p2);
		System.out.println(p2);
	}
}