public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	/** Exercise 2.2.1 an addFirst method 
	like SLList. Adds an item to the front 
	of the list.*/
	public IntList addFirst(int x) {
		// We don't know where the first node is
		// cause the node can also be the middle node
		// default this node always to be the head.
		// This node cannot be assigned,
		// so we need to create a new this node as the head.
		IntList p = new IntList(this.first, this.rest);
		p = new IntList(x, p);
		return p;//return head
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		//L = new IntList(10, L);
		//L = new IntList(5, L);
		//System.out.println(L.get(100));
		L = L.addFirst(10);
		L = L.addFirst(5);
		L = L.addFirst(6);
		System.out.println(L.get(1));
	}
} 