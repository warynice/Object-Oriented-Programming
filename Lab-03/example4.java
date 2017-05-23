public class example4 {
	static int[] initializeArray(int n) {
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = i;
		}
		return arr;
	}
	static int[] values = initializeArray(10);
	void listvalues() {
		for(int value:values) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		example4 amit = new example4();
		amit.listvalues();
		amit.values[0] = amit.values[4]=16;
		example4 tiwary = new example4();
		tiwary.listvalues();
	}
}