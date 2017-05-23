public class example2 {
	static {
		System.out.println("This is the first static block");
	}
	public example2() {
		System.out.println("This is the constructor");
	}
	public static String staticString="Static Variable";
	static {
		System.out.println("This is the second static block and " + staticString);
	}
	public static void method() {
		System.out.println("This is first method");
	}
	public static void method2() {
		System.out.println("This is second method");
	}
	public static void main(String[] args) {
		example2 exa = new example2();
		exa.method2();
	}
}