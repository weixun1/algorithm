package algorithmsorting;

public class QuickSort {

	public static void main(String[] args) {

		int[] a = new int[10];

		a[0] = 9;
		a[1] = 7;
		a[2] = 5;
		a[3] = 11;
		a[4] = 12;
		a[5] = 2;
		a[6] = 14;
		a[7] = 3;
		a[8] = 10;
		a[9] = 6;

		quickSort(a, 0, a.length - 1);

		PrintArr.p(a);

	}

	// {9, 7, 5, 11, 12, 2, 14, 3, 10, 6}
	public static int[] quickSort(int[] a, int l, int r) {

		int p = a[r];

		int pI = r;

//		l = 0;
//		r = a.length - 1;

		while (l < r) {

			if (a[l] > p) {

				while (r > l) {

					if (a[r] < p) {

						int tmp = a[r];

						a[r] = a[l];
						a[l] = tmp;
						r--;
						break;
					}

					r--;

				}

			}

			if (r == l) {
				break;
			}

			l++;

		}

//		System.out.println("l =" + l + ",r=" + r);
//		if (l == r) {
//
//			System.out.println("boundary equal");
//		}

		a[pI] = a[l];
		a[l] = p;

		if (l > 1) {
			a = quickSort(a, 0, l - 1);

		}
		if(pI - l > 1) {
			a = quickSort(a, l + 1, a.length - 1);
		}


		return a;
	}
}
