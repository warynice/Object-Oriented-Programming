import java.util.Scanner;
class Item {
	private String ItemName;
	private String ItemNumber;
	private int ItemQuantity;
	private double price;
	Item(String ItemName, String ItemNumber, int ItemQuantity, double price) {
		this.ItemName = ItemName;
		this.ItemNumber = ItemNumber;
		this.ItemQuantity = ItemQuantity;
		this.price = price;
	}
	Item(String ItemName, String ItemNumber, int ItemQuantity) {
		this.ItemName = ItemName;
		this.ItemNumber = ItemNumber;
		this.ItemQuantity = ItemQuantity;
	}
	Item(String ItemName, String ItemNumber) {
		this.ItemName = ItemName;
		this.ItemNumber = ItemNumber;
	}
	public String getItemName() {
		return this.ItemName;
	}
	public String getItemNumber() {
		return this.ItemNumber;
	}
	public int getItemQuantity() {
		return this.ItemQuantity;
	}
	public double getprice() {
		return this.price;
	}
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public void setItemNumber(String ItemNumber) {
		this.ItemNumber = ItemNumber;
	}
	public void setItemQuantity(int ItemQuantity) {
		this.ItemQuantity = ItemQuantity;
	}
	public void setprice(double price) {
		this.price = price;
	}
}
class Customer {
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	
	Customer(String name, String idNo, double balance) {
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
	}
	Customer(String name, String idNo) {
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000;
	}
	public String getName() {
		return this.name;
	}
	public String getIdNo() {
		return this.idNo;
	}
	public double getBalance() {
		return this.balance;
	}
	public Item getItem() {
		return this.item;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public void print() {
		System.out.println(item.getItemName());
		System.out.println(item.getItemNumber());
		System.out.println(item.getItemQuantity());
		System.out.println(item.getprice());
	}
	public void buyItem(Item item) {
		if(this.balance < item.getprice()) {
			System.out.println("Insuficient Balance");
			return;
		}
		else if(item.getItemQuantity() < 1) {
			System.out.println("Order is not valid");
			return;
		}
		this.item = item;
		this.balance = this.balance - item.getprice();
	}
}
public class TestStore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Java Food Store!!!!!");
		System.out.println("Please enter your name, id and balance");
		String name = in.next();
		String idNo = in.next();
		double balance = in.nextDouble();
		Customer c1 = new Customer(name,idNo,balance);
		System.out.println("Enter Item name, id, quantity, price");
		String itemname;
		String itemid;
		int quantity;
		double price;
		itemname = in.next();
		itemid = in.next();
		quantity = in.nextInt();
		price = in.nextDouble();
		Item it1 = new Item(itemname,itemid,quantity,price);
		c1.buyItem(it1);
		c1.print();
		System.out.println("Balance Left: " + c1.getBalance());
		System.out.println("Enter Item name, id, quantity, price");
		itemname = in.next();
		itemid = in.next();
		quantity = in.nextInt();
		price = in.nextDouble();
		Item it2 = new Item(itemname,itemid,quantity,price);
		c1.buyItem(it2);
		c1.print();
		System.out.println("Balance Left: " + c1.getBalance());
		in.close();
	}
}