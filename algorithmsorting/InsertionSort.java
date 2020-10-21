package algorithmsorting;

public class InsertionSort {

	public static void main(String[] args) {

		int[] a = new int[5];
//		a[0] = 4;
//		a[1] = 3;
//		a[2] = 2;
//		a[3] = 10;
//		a[4] = 12;
//		a[5] = 1;
//		a[6] = 5;
//		a[7] = 6;
		
		a[0] = 12;
		a[1] = 11;
		a[2] = 13;
		a[3] = 5;
		a[4] = 6;
		
		
		
		int min = 0;
		int minIndex = 0;

		PrintArr.p(a);

		for (int i = 0; i < a.length - 1; i++) {

			min = a[i];
			minIndex = i;

			if (a[i + 1] < min) {
				min = a[i + 1];

				
				
				for (int j = 0; j < i + 1; j++) {
					
					if (min < a[j]) {

						for (int k = i; k >= j; k--) {

							a[k + 1] = a[k];
						}
						
						a[j] = min;
						break;
					}
				}

			}

			PrintArr.p(a);

		}

	}

}
