abstract class Worker {
	public String name;
	public double salary_rate;
	Worker(String name, double salary_rate) {
		this.name = name;
		this.salary_rate = salary_rate;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary_Rate() {
		return this.salary_rate;
	}
	public abstract double computePay();
}
class FullWorker extends Worker {
	public double hours;
	FullWorker(String name, double salary_rate, double hours) {
		super(name,salary_rate);
		if(hours > 240)
			hours = 240;
		this.hours = hours;
	}
	public double computePay() {
		return this.hours * super.getSalary_Rate();
	}
}
class HalfWorker extends Worker{
	public double hours;
	HalfWorker(String name, double salary_rate, double hours) {
		super(name,salary_rate);
		if(hours > 60)
			hours = 60;
		this.hours = hours;
	}
	public double computePay(){
		return this.hours * super.getSalary_Rate();
	}
}
public class exercise3 {
	public static void main(String[] args) {
		Worker w1 = new FullWorker("amit",100,215);
		System.out.println(w1.computePay());
		w1 = new HalfWorker("kabir",50,55);
		System.out.println(w1.computePay());
	}
}