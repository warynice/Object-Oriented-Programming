import java.util.Scanner;
public class Exercise2 {
	public static void main(String args[]) {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 integers");
		int x;
		for(int i=0; i<10; i++) {
			x = in.nextInt();
			sum += x;
		}
		System.out.println(sum);
		in.close();
	}
}