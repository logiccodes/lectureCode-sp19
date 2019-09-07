//import org.omg.CORBA.Object;

//import java.util.Objects;

/** Array based list.
 *  @author Josh Hug
 */

public class AList<MindHunter> {
    private MindHunter[] elems;
    private int size;
    /** Creates an empty list. */
    public AList() {
        elems = (MindHunter[]) new Object[100];
        size = 0;
    }

    /** Resizing the array to the target capacity. */
    private void resize(int target) {
        MindHunter[] a = (MindHunter[]) new Object[target];
        System.arraycopy(elems, 0, a, 0,size);
        elems = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(MindHunter x) {
        if (size  == elems.length) {
            resize(size*2);
        }
        elems[size] = x;
        size += 1;
    }
    /*
     * Suppose we have an array of size 100. If we call addLast two times,
     * how many total boxes will we need to create and fill throughout this entire process?
     * What is the maximum number of array boxes that Java will track at any one time,
     * assuming that garbage collection happens as soon as the last reference to an array is lost?
     *
     * 101+102 = 203
     * max(100+101, 101+102)=203
     *
     * Starting from an array of size 100, approximately how many total array memory boxes
     * will get created and filled if we call addLast  until size=1,000?
     * What is the maximum number of array boxes that Java will track at any one time,
     * assuming that garbage collection happens as soon as the last reference to an array is lost?
     * 101+102+...+1000=(101+1000)*900/2=495450
     * 999+1000=1999
     *
     * */

    /** Returns the item from the back of the list. */
    public MindHunter getLast() {
        return elems[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public MindHunter get(int i) {
        return elems[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    public int fsize() {
        return elems.length;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public MindHunter removeLast() {
        MindHunter templast = getLast();
        elems[size - 1] = null;
        size -= 1;
        if (size < elems.length / 4) {
            resize(elems.length/2);
        }
        return templast;
    }

    public static void main (String[] args) {
        AList<Integer> L = new AList<>();
        L.addLast(99);
        L.addLast(98);
        System.out.println(L.fsize());
        L.removeLast();
        System.out.println(L.getLast());
        System.out.println(L.fsize());
    }
} 