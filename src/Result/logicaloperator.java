package Result;

public class logicaloperator {

	public static void main(String[] args) {
		
		int n, d;
		n = 10;

		d = 2;

		if(d != 0 && (n % d) == 0)

		System.out.println(d + " is a factor of " + n); d = 0; // now, set d to zero
		// Since d is zero, the second operand is not evaluated. 
		if(d != 0 && (n % d) == 0)
		System.out.println(d + " is a factor of " + n);
		
	}

}
