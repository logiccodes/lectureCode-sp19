public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode node = first;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new IntNode(x, null);
    }

    /** we'll create a private helper method that 
    interacts with the underlying naked recursive data structure.*/
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }
    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        /*a recursive implementation of size, 
         which will yield an interesting challenge.
         IntNode class don't have size().*/
        /* first is lost.*/
        /*
        if (first.next == null){
            return 1;
        } 
        first = first.next;
        return 1 + size();*/
        return size(first);
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addLast(20);
        System.out.println(L.size());
        System.out.println(L.getFirst());
    }
}
