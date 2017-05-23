import java.util.*;
interface BinaryInterface {
	void toBinary(int N);
	void print();
}
class OnesComplement implements BinaryInterface {
	ArrayList<Integer> arr = new ArrayList<Integer>(8);
	public void toBinary(int N) {
		for(int k=0; k<8; k++) {
			arr.add(0);
		}
		int num = -1 * N;
		int i = 7;
		while(num != 0) {
			arr.set(i, num%2);
			num = num/2;
			i -= 1;
		}
		// Taking One's Complement
		for(int j=1; j<arr.size(); j++) {
			if(arr.get(j) == 0){
				arr.set(j, 1);
			}
			else {
				arr.set(j, 0);
			}
		}
		if(N < 0) {
			arr.set(0, 1);
		}
		else {
			arr.set(0, 0);
		}
		
	}
	public void print() {
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("");
	}
}
class SignedMagnitude implements BinaryInterface {
	OnesComplement cmp;
	ArrayList<Integer> arr = new ArrayList<Integer>(8);
	public void toBinary(int N) {
		cmp = new OnesComplement();
		cmp.toBinary(N);
		for(int i=0; i<cmp.arr.size(); i++) {
			if(cmp.arr.get(i) == 0) {
				this.arr.add(1);
			}
			else {
				this.arr.add(0);
			}
		}
		if(N < 0) {
			arr.set(0,1);
		}
		else {
			arr.set(0,0);
		}
	}
	public void print() {
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("");
	}
}
class TwoComplement implements BinaryInterface {
	OnesComplement cmp;
	ArrayList<Integer> arr = new ArrayList<Integer>(8);
	public void toBinary(int N) {
		cmp = new OnesComplement();
		cmp.toBinary(N);
		for(int k=0; k<8; k++) {
			arr.add(0);
		}
		int sum;
		int carry=1;
		for(int i=7; i>=0; i--) {
			int x = cmp.arr.get(i);
			if(x == 1 && carry == 1) {
				this.arr.set(i, 0);
				carry = 1;
			}
			else if(x == 1 && carry == 0) {
				this.arr.set(i, 1);
				carry=0;
			}
			else {
				this.arr.set(i, carry);
				carry=0;
			}
		}
	}
	public void print() {
		for(int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println("");
	}
}
public class exercise2 {
	public static void main(String[] args) {
		BinaryInterface one = new OnesComplement();
		one.toBinary(-16);
		one.print();
		one = new SignedMagnitude();
		one.toBinary(-16);
		one.print();
		one = new TwoComplement();
		one.toBinary(-16);
		one.print();
	}
}