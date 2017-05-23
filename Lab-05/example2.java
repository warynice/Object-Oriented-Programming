class shape {
	private String color;
	shape(String color) {
		this.color = color;
	}
	public String toString() {
		return "Color of the shape is" + this.color;
	}
	public void getArea() {
		System.err.print("Cant compute area!! shape unknown");
	}
}
class rectangle extends shape {
	private double length;
	private double width;
	rectangle(String color,int length,int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return "Length: " + this.length + " Width: " + this.width;
	}
	public void getArea(){
		System.out.println(length*width);
	}
}
class triangle extends shape {
	private double height;
	private double base;
	triangle(String color,int height,int base) {
		super(color);
		this.height = height;
		this.base = base;
	}
	public String toString() {
		return "Height: " + this.height + " Base: " + this.base;
	}
	public void getArea() {
		System.out.println(0.5*base*height);
	}
}
public class example2 {
	public static void main(String[] args) {
		shape s1 = new rectangle("blue", 4, 5);
		System.out.println(s1);
		s1.getArea();
		shape s2 = new triangle("red", 4, 5);
		System.out.println(s2);
		s2.getArea();
	}
}