package algorithmsorting;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		int[] a = new int[10];
		
		a[0]= 9;
		a[1]= 7;
		a[2]= 5;
		a[3]= 11;
		a[4]= 12;
		a[5]= 2;
		a[6]= 14;
		a[7]= 3;
		a[8]= 10;
		a[9]= 6;
		
		PrintArr.p(a);
		a = bubbleSort(a);
		
		PrintArr.p(a);
		
	}

	public static int[] bubbleSort(int[] a) {

		int c = 0;
		while (c < a.length) {

			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] > a[i + 1]) {

					int tmp = a[i];

					a[i] = a[i + 1];
					a[i + 1] = tmp;

				}

			}

			c++;
		}

		return a;
	}
}
