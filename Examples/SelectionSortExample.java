//Selection Sort (Ascending)
public class SelectionSortExample {
    static int i, j;

    public static void selectionSort(int[] array, int l) {
        for (i = 0; i < l - 1; i++) {
            int index = i;
            for (j = i + 1; j < l; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int smallerNumber = array[i];
            array[i] = array[index];
            array[index] = smallerNumber;
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
