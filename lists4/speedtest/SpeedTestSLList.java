public class SpeedTestSLList {
	public static void main(String[] args) {
		SLList<Integer> L = new SLList<>();
		int i = 0;
<<<<<<< HEAD
		while (i < 10000000) {
=======
		while (i < 100000) {
>>>>>>> c98b4750f0eb48c4da2edf0a5741612df195035d
			L.addFirst(i);
			i = i + 1;
		}
	}
} 