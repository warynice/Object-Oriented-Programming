import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class BankIO {

	public static void readFile(String filename, Bank bank)  throws IOException {
		Scanner in;
		try{
			in = new Scanner(new File(filename));
			BankAccount b;
			while((b=readAccount(in))!=null){
				bank.add(b);
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	public static BankAccount readAccount(Scanner in){
		if(!in.hasNextInt())
			return null;
		// String line = in.nextLine();
		// String[] tokens = line.split(" ");
		/* double ammount = Double.parseDouble(tokens[1]);
		int account = Integer.parseInt(tokens[0]); */
		// System.out.println("hello");
		int account = in.nextInt();
		double ammount = in.nextDouble();
		return new BankAccount(ammount,account);
	}
	public static void write(String filename,Bank bank){
		PrintWriter out;
		try{
			out = new PrintWriter(filename);
			out.write(bank.toString());
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
}
