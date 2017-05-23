import java.io.IOException;
import java.util.*;
class Name {
	private String fname;
	private String mname;
	private String lname;
	Name(String name) {
		if(name.indexOf(',') != -1) {
			StringTokenizer st = new StringTokenizer(name, ",");
			fname = st.nextToken();
			mname = st.nextToken();
			lname = st.nextToken();
		}
		else {
			StringTokenizer st = new StringTokenizer(name, ";");
			lname = st.nextToken();
			mname = st.nextToken();
			fname = st.nextToken();
		}
	}
	public String getFname() {
		return this.fname;
	}
	public String getMname() {
		return this.mname;
	}
	public String getLname() {
		return this.lname;
	}
	public String getName() {
		return this.fname + " " + this.mname + " " + this.lname;
	}
	public String toString() {
		return this.fname + this.mname + this.lname;
	}
}
class Student {
	private Name name;
	private int age;
	Student(Name name,int age) {
		this.name = name;
		this.age = age;
	}
	public Name getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String toString() {
		return this.name.getFname() + " " + this.name.getMname() + " " + this.name.getLname() + " " + this.age;
	}
}
class StudentList {
	public static Student[] list = new Student[10];
	public static int count = 0;
	public static void addStudent(Student s1) {
		if(count > 10)
			return;
		list[count] = s1;
		count++;
	}
	public static Student[] getStudentswithAge(int age) {
		Student[] std = new Student[10];
		int j = 0;
		for(int i=0; i<10; i++) {
			if(list[i].getAge() == age) {
				std[j] = list[i];
				j++;
			}
		}
		return std;
	}
	public static Student[] getStudentswithLastName(String lastName) {
		Student[] std = new Student[10];
		int j = 0;
		for(int i=0; i<10; i++) {
			if(list[i].getName().getLname() == lastName) {
				std[j] = list[i];
				j++;
			}
		}
		return std;
	}
	public static Student[] getStudentsInRange(int min,int max) {
		Student[] std = new Student[10];
		int j = 0;
		for(int i=0; i<10; i++) {
			if(list[i].getAge() >= min && list[i].getAge() <= max) {
				std[j] = list[i];
				j++;
			}
		}
		return std;
	}
}
public class Excercise2 {
	public static Student readStudent() throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First name: ");
		String fname = scan.next();
		System.out.println("Enter middle name: ");
		String mname = scan.next();
		System.out.println("Enter Last name: ");
		String lname = scan.next();
		System.out.println("Enter name Format: ");
		String format = scan.next();
		System.out.println("Enter Age: ");
		int age = scan.nextInt();
		Name n1;
		if(format == ",") {
			n1 = new Name(fname + format + mname + format + lname);
		}
		else {
			n1 = new Name(lname + format + mname + format + fname);
		}
		Student s1 = new Student(n1, age);
		return s1;
	}
	public static void main(String[] args) throws IOException {
		for(int i=0; i<10; i++) {
			StudentList.addStudent(readStudent());
		}
		Student[] std1 = StudentList.getStudentswithAge(20);
		for(int i=0; i<std1.length; i++) {
			System.out.println(std1[i]);
		}
		Student[] std2 = StudentList.getStudentswithLastName("Sharma");
		for(int i=0; i<std2.length; i++) {
			System.out.println(std2[i]);
		}
		Student[] std3 = StudentList.getStudentsInRange(16,20);
		for(int i=0; i<std3.length; i++) {
			System.out.println(std3[i]);
		}
	}
}