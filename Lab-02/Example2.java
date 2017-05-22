import java.util.Scanner;
public class Example2 {
	public static void main(String args[]) {
		int num1;
		double num2;
		String strnum1,strnum2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		num1 = in.nextInt();
		System.out.println("You have entered " + num1);
		System.out.println("Enter a double: ");
		num2 = in.nextDouble();
		System.out.println("You have entered " + num2);
		System.out.println("Enter your name: ");
		strnum1 = in.next();
		System.out.println("You have entered " + strnum1);
		System.out.println("Enter your surname: ");
		strnum2 = in.nextLine();
		System.out.println("Yor surname is " + strnum2);
		in.close();
	}
}