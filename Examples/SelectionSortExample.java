//Selection Sort (Ascending)
public class SelectionSortExample {
	static int i, j;

	public static void selectionSort(int[] array, int l) {
		for (i = 0; i < l; i++) {
			int min = i;
			for (j = i + 1; j < l; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
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
		selectionSort(array, l);
		System.out.print("\nArray after sorting: ");
		for (int i : array)
			System.out.print(i + " ");
	}
}
