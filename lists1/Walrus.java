public class Walrus {
	public int weight;
	public double tuskSize;

	public Walrus(int w, double ts) {
		weight = w;
		tuskSize = ts;
	}

	public static void main(String[] args) {
		Walrus someWalrus;
		//System.out.println(someWalrus);
		// error: variable someWalrus might not have been initialized
		//Java does not write anything into the reserved box when a variable is declared. 
		//As a result, the Java compiler prevents you from using a variable 
		//until after the box has been filled with bits using the = operator
		someWalrus = new Walrus(1000, 8.3);
		System.out.println(someWalrus.weight);
		System.out.println(someWalrus);
		//Walrus@6bc7c054
		// the exact memory address is below the level of abstraction 
		// accessible to us in Java.
		
		//someWalrus = 223;
		// error: incompatible types: int cannot be converted to Walrus
		someWalrus = null;
		System.out.println(someWalrus); //null
		System.out.println(someWalrus.weight); 
		// Exception in thread "main" java.lang.NullPointerException
	}
}

