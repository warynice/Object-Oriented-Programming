class circle {
	double radius;
	String color;
	circle() {
		this.radius = 1;
		this.color = "red";
	}
	circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	circle(double radius,String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return this.radius;
	}
	public String getColor() {
		return this.color;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
}
class cylinder extends circle {
	private double height;
	cylinder() {
		super();
		this.height = 1;
	}
	cylinder(double radius,double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		return 2*Math.PI*this.radius*this.radius*this.height;
	}
}
public class example1 {
	public static void main(String[] args) {
		cylinder c1 = new cylinder();
		System.out.println(c1.getRadius() + " " + c1.getColor() + " " + c1.getHeight() + " " + c1.getArea() + " " + c1.getVolume());
	}
}