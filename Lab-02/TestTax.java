import java.util.Scanner;
class TaxOnSalary {
	private double salary;
	private boolean isPansubmitted;
	TaxOnSalary(boolean isPanSubmitted) {
		this.isPansubmitted = isPanSubmitted;
		this.salary = 1000.00;
	}
	TaxOnSalary() {
		this.salary = 0.0;
		this.isPansubmitted = false;
	}
	public double getSalary() {
		return this.salary;
	}
	public boolean getIsPansubmitted() {
		return this.isPansubmitted;
	}
	public double calculateTax() {
		if(this.salary < 180000 && this.isPansubmitted==true)
			return 0;
		else if(this.salary < 180000 && this.isPansubmitted==false)
			return 0.05*this.salary;
		else if(this.salary > 180000 && this.salary < 500000)
			return 0.1*this.salary;
		else if(this.salary > 500000 && this.salary < 1000000)
			return 0.2*this.salary;
		else
			return 0.3*this.salary;
	}
	public void InputSalary() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter you Salary:");
		this.salary = in.nextDouble();
	}
}
public class TestTax {
	public static void main(String[] args) {
		TaxOnSalary t1 = new TaxOnSalary(true);
		TaxOnSalary t2 = new TaxOnSalary();
		t1.InputSalary();
		System.out.println("Tax is: " +t1.calculateTax());
		t2.InputSalary();
		System.out.println("Tax is: " +t2.calculateTax());
	}
}