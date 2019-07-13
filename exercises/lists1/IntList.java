public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null){
			return 1;
		}
		// why not if(this == null) return 0; ? 
		// because it will cause this.size() called by this.rest.size() 
		// throw NullPointer error
		return 1+this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int countSize = 0;
		while(p != null) {
			countSize += 1;
			p = p.rest;
		}
		return countSize;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if (i == 0){
			return this.first;
		}
		return this.rest.get(i-1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.println(L.iterativeSize());
		System.out.println(L.size());
		System.out.println(L.get(L.size()-1));
	}
} 