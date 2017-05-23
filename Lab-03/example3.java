public class example3 {
	{ 
		System.out.println("This is first constructor block");
	}
	public example3() {
		System.out.println("This is the constructor with no parameters");
	}
	public example3(String blah) {
		System.out.println("This is constructor with one parameter");
	}
	{
		System.out.println("This is second constructor block");
	}
	public static void main(String[] args) {
		example3 amit = new example3();
		example3 tiwary = new example3("amit");
	}
}