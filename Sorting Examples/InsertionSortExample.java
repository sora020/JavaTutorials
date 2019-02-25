//Insertion Sort (Ascending)
public class InsertionSortExample {
	static int i, j, key;

	public static void insertionSort(int[] array, int l) {
		for (i = 0; i < l; i++) {
			for (j = i; j > 0; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				} else
					break;
			}
	    /*temp = array[i];
            j = i;
            for(;j > 0; j--) { 
		if(a[j-1] > temp) 
			a[j] = a[j-1];
		else
			break;
            }
            array[j] = temp;*/
		}
	}

	public static void main(String... args) {
		int l = args.length;
		int[] array = new int[l];
		for (i = 0; i < l; i++)
			array[i] = Integer.parseInt(args[i]);
		System.out.print("Array before sorting: ");
		for (int i : array)
			System.out.print(i + " ");
		insertionSort(array, l);
		System.out.print("\nArray after sorting: ");
		for (int i : array)
			System.out.print(i + " ");
	}
}
