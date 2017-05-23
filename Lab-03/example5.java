class circle {
	final double pi;
	private double radius;
	circle(double radius) {
		this.radius = radius;
		this.pi = 3.14;
	}
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return pi*this.radius*this.radius;
	}
	public final void getCircumfrence(double radius) {
		System.out.println(2*pi*radius);
	}
}
public class example5 {
	public static void main(String[] args) {
		circle c1 = new circle(2.3);
		System.out.println(c1.getArea());
		c1.getCircumfrence(2.3);
		circle c2 = new circle(4.16);
		System.out.println(c2.getArea());
		c2.getCircumfrence(4.16);
	}
}