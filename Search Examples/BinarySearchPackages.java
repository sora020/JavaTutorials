import java.util.Arrays;
public class BinarySearchPackages {
	public static void main(String... args) {
		int[] array = {10, 40, 30, 1, 50, 100, 90, 70, 68};
		Arrays.sort(array);
		System.out.println("Array after sorting");
		for(int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " ");
		System.out.println();
		int search = 68;
		int binarySearch = Arrays.binarySearch(array, search);
		System.out.println(search + " is in the index: " + binarySearch + " of the given array");
	}
}
