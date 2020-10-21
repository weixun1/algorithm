package algorithmsorting;

public class MergeSort {
	public static void main(String[] args) {

		int[] a = new int[7];

		a[0] = 38;
		a[1] = 27;
		a[2] = 43;
		a[3] = 3;
		a[4] = 9;
		a[5] = 82;
		a[6] = 10;

		int middle = (int) Math.floor(a.length / 2);

		int[] l = new int[middle];

		int[] r = new int[a.length - middle];

		for (int i = 0; i < a.length; i++) {

			if (i < l.length) {
				l[i] = a[i];
			} else {
				r[i - l.length] = a[i];
			}

		}

		l = sortArr(l);
		r = sortArr(r);
		
		
		
		
		
		PrintArr.p(l);
		PrintArr.p(r);
		
		PrintArr.p(a);
		a = merge(l,r);
		
		PrintArr.p(a);
		
		

	}

	public static int[] sortArr(int[] arr) {
		int globalMin = 0;
		int globalMinIndex = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			globalMin = arr[i];
			globalMinIndex = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < globalMin) {
					globalMin = arr[j];
					globalMinIndex = j;
				}
			}

			int tmp = arr[globalMinIndex];

			arr[globalMinIndex] = arr[i];
			arr[i] = tmp;

		}

		return arr;
	}
	
	
	public static int[] merge(int[] ar1, int[] ar2) {

		int[] r = new int[ar1.length + ar2.length];
		int l1 = 0;

		int l2 = 0;

		while (l1 < ar1.length || l2 < ar2.length) {

			
			
			if(l1 == ar1.length) {
				r[l1+l2] = ar2[l2];
				l2++;
			}
			else if(l2==ar2.length) {
				r[l1+l2] = ar1[l1];
				l1++;
			}
			else if (ar1[l1] < ar2[l2]) {
				r[l1 + l2] = ar1[l1];
				l1++;
			}
			else if(ar1[l1] > ar2[l2]) {
				r[l1 + l2] = ar2[l2];
				l2++;
			}

		}

		return r;
	}
}
