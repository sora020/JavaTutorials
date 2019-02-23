//Insertion Sort (Ascending)
public class InsertionSortExample {
    static int i, j, key;

    public static void insertionSort(int[] array, int l) {
        for (i = 1; i < l; i++) {
            key = array[i];
            j = i - 1;
            while ((j > -1) && (array[j] > key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
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
