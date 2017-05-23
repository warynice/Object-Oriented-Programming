class A {
	public int a = 100;
}
class B extends A {
	public int a = 80;
}
class C extends B {
	public int a = 60;
}
class D extends C {
	public int a = 40;
}
class E extends D {
	public int a = 10;
	public void show() {
		int a = 0;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(((D)this).a);
		System.out.println(((C)this).a);
		System.out.println(((B)this).a);
		System.out.println(((A)this).a);
	}
}
public class exercise1 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.show();
	}
}