package beans;

public class Compare {

	public static void plusMinus(int[] arr) {
		int fraction = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				double rez = (double) arr[i] / fraction;
				System.out.println(rez);
			} else {
				continue;
			}
		}
	}

	public static int[] getCompare(int[] a, int[] b) {
		int sumA = 0;
		int sumB = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] > b[i]) {
				sumA = sumA + 1;
			} else if (a[i] < b[i]) {
				sumB = sumB + 1;
			} else {
				continue;
			}

		}
		return new int[] { sumA, sumB };
	}
}
