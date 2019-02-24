//Bubble Sort (Ascending)
public class BubbleSortExample1 {
	static int temp = 0, i, j;

	public static void bubbleSort(int[] array, int l) {
		for (i = 0; i < (l - 1); i++) {
			for (j = 0; j < (l - i - 1); j++) {
				if ((array[j]) > (array[j + 1])) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
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
		bubbleSort(array, l);
		System.out.print("\nArray after sorting: ");
		for (int i : array)
			System.out.print(i + " ");
	}
}
