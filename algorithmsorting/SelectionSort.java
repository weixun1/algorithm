package algorithmsorting;

public class SelectionSort {
	public static void main(String[] args) {

		int[] arr = new int[10];
		arr[0] = 64;
		arr[1] = 25;
		arr[2] = 12;
		arr[3] = 22;
		arr[4] = 11;
		arr[5] = 21;
		arr[6] = 53;
		arr[7] = 77;
		arr[8] = 11;
		arr[9] = 1;
		p(arr);
		
		int globalMin = 0;
		int globalMinIndex = 0;
		
		for (int i = 0; i < arr.length -1; i++) {
			globalMin = arr[i];
			globalMinIndex = i;

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] < globalMin) {
					globalMin = arr[j];
					globalMinIndex = j;
				}
			}

			int tmp = arr[globalMinIndex];

			arr[globalMinIndex] = arr[i];
			arr[i] = tmp;
			
			
			p(arr);

		}

	}

	public static void p(int[] a) {
		for(int i = 0; i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		
		System.out.println();
		System.out.println("------------------");
		
		
	}
}
