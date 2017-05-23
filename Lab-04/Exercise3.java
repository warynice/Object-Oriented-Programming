import java.util.*;
class Address {
	private String line1;
	private String line2;
	private String line3;
	private char[] city;
	private char[] state;
	private String pin;
	Address(String address) {
		StringTokenizer st = new StringTokenizer(address,"$");
		this.line1 = st.nextToken();
		this.line2 = st.nextToken();
		this.line3 = st.nextToken();
		this.city = st.nextToken().toCharArray();
		this.state = st.nextToken().toCharArray();
		this.pin = st.nextToken();
	}
	public String getLine1() {
		return this.line1;
	}
	public String getLine2() {
		return this.line2;
	}
	public String getLine3() {
		return this.line3;
	}
	public String getCity() {
		return new String(this.city);
	}
	public String getState() {
		return new String(this.state);
	}
	public String getPin() {
		return this.pin;
	}
}
class AddressList {
	public static int countAddressWithCity(Address[] ad, String city) {
		int count = 0;
		for(int i=0; i<ad.length; i++) {
			if(ad[i].getCity() == city)
				count++;
		}
		return count;
	}
	public static int countAddressWithPin(Address[] ad, String pin) {
		int count = 0;
		for(int i=0; i<ad.length; i++) {
			if(ad[i].getPin() == pin)
				count++;
		}
		return count;
	}
	public String[] getAddressWithCity(Address[] ad, String city) {
		if(ad == null || city == null)
			return null;
		if(countAddressWithCity(ad,city) == 0)
			return null;
		String[] address = new String[ad.length];
		int j = 0;
		for(int i=0; i<ad.length; i++) {
			if(ad[i].getCity() == city) {
				address[j] = ad[i].getLine1() + "$" + ad[i].getLine2() + "$" + ad[i].getLine3();
				j++;
			}
		}
		return address;
	}
	public String[] getAddressWithPin(Address[] ad, String pin) {
		if(ad == null || pin == null)
			return null;
		if(countAddressWithPin(ad,pin) == 0)
			return null;
		String[] address = new String[ad.length];
		int j = 0;
		for(int i=0; i<ad.length; i++) {
			if(ad[i].getPin() == pin) {
				address[j] = ad[i].getLine1() + "$" + ad[i].getLine2() + "$" + ad[i].getLine3();
				j++;
			}
		}
		return address;
	}
}
public class Excercise3 {
	public static void main(String[] args) {
		// Write methods to test the above classes
	}
}