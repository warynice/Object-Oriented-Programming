class Box {
	private double length;
	private double width;
	private double height;
	Box(double length,double width,double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getHeight() {
		return this.height;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return "length= " + this.length + " width= " + this.width + " height= " + this.height;
	}
	public static void swapBoxes(Box b1, Box b2) {
		Box temp;
		temp = b1;
		b1 = b2;
		b2 = temp;
	}
}
public class example7 {
	public static void main(String[] args) {
		Box b1 = new Box(2,2,4);
		Box b2 = new Box(3,3,7);
		System.out.println(b1);
		System.out.println(b2);
		Box temp;
		temp = b1;
		b1 = b2;
		b2 = temp;
		Box.swapBoxes(b1,b2);
		System.out.println(b1);
		System.out.println(b2);
	}
}