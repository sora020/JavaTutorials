//Bubble Sort (Ascending)
public class BubbleSortExample {
	public static void main(String[] args) {
		int l = args.length;
		int[] array = new int[l];
		for (int i = 0; i < l; i++)
			array[i] = Integer.parseInt(args[i]);
		int temp = 0;
		System.out.print("Array before sorting: ");
		for (int i : array)
			System.out.print(i + " ");
		for (int i = 0; i < (l - 1); i++) {
			for (int j = 0; j < (l - i - 1); j++) {
				if ((array[j]) > (array[j + 1])) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("\nArray after sorting: ");
		for (int i : array)
			System.out.print(i + " ");
	}
}
