public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    //private IntNode first; 
    private IntNode sentinel;
    private int size;

    public SLList() {
        //first = null;
        sentinel = new IntNode(-35672, null);
        size = 0;
    }

    public SLList(int x) {
        //first = new IntNode(x, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        //first = new IntNode(x, first);
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        //return first.item;
        return sentinel.next.item;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        //IntNode p = first;
        IntNode p = sentinel;
        /**
        Human beings only have so much working memory, 
        and thus we want to keep complexity under control 
        wherever possible. For a simple data structure 
        like the SLList, the number of special cases is small. 
        More complicated data structures like trees can get much, much uglier.
        */
        /*
        if (p == null) {
            p = new IntNode(x, null);
            return;
        }*/
        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size += 1;
    }

    /** Crashes when you call addLast on an empty SLList. Fix it. */
    public static void main(String[] args) {
        SLList x = new SLList();
        x.addLast(5);
        x.addLast(10);
        System.out.println(x.size());
        System.out.println(x.getFirst());
    }
}
