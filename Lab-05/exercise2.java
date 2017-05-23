class employee {
	public String name;
	public double salary;
	employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name: " + this.name + " salary" + this.salary;
	}
}
class manager extends employee {
	private String department;
	manager(String name,double salary,String department) {
		super(name,salary);
		this.department = department;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String toString() {
		return "Name: " + super.getName() + " Salary: " + super.getSalary() + " Division: " + this.department;
	}
}
public class exercise2 {
	public static void main(String[] args) {
		employee e = new employee("Louis", 1000000);
		System.out.println(e);
		e = new manager("Harvey", 10000000, "Settlement");
		System.out.println(e);
	}
}