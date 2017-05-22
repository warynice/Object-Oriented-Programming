import java.io.*;
public class Exercise1 {
	public static void main(String args[]) throws IOException {
		int sum = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter 10 numbers");
		for(int i=0; i<10; i++) {
			int x = Integer.parseInt(br.readLine());
			sum += x;
		}
		System.out.println(sum);
	}
}