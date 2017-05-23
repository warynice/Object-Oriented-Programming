import java.io.IOException;
import java.util.*;
public class BankFileTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String filename = in.next();
		Bank bank = new Bank(7);
		try{
			BankIO.readFile(filename,bank);
		}
		catch(IOException e){
			e.getMessage();
		}
		System.out.println(bank);
		/* filename = in.next();
		BankIO.write(filename,bank);
		in.close(); */
		in.close();
	}

}
