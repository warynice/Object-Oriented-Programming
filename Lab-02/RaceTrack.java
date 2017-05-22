class Car {
	private int year;
	private String Make;
	private double speed;
	Car(int year, String Make, double speed) {
		this.year = year;
		this.Make = Make;
		this.speed = speed;
	}
	public int getYear() {
		return this.year;
	}
	public String getMake() {
		return this.Make;
	}
	public double getSpeed() {
		return this.speed;
	}
	public void Accelerate() {
		this.speed += 1;
	}
	public void Accelerate(int increment) {
		this.speed += increment;
	}
	public void Break(int b) {
		double bval=Math.sqrt(b);
		this.speed -=bval;
	}
}
public class RaceTrack {
	public static void main(String[] args) {
		Car c1 = new Car(2015,"TATA",30);
		System.out.println(c1.getYear());
		System.out.println(c1.getMake());
		System.out.println(c1.getSpeed());
		c1.Accelerate();
		System.out.println(c1.getSpeed());
		c1.Accelerate(10);
		System.out.println(c1.getSpeed());
		c1.Break(4);
	}
}