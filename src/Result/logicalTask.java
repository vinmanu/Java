package Result;

public class logicalTask {

	public static void main(String[] args) {
		 
		boolean p, q;
		System.out.println("P\tQ\tPANDQ\tPORQ\tPXORQ\tNOTP"); 
		p = true;
		q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = true;
		q = false;
		System.out.print(p + "\t" + q +"\t"); 
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false;
		q = true;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		p = false; 
		q = false;
		System.out.print(p + "\t" + q +"\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
	}

}
