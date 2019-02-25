import java.util.Arrays;
public class BinarySearch {
	public static int binarySearch(int[] array, int first, int last, int search) {
		int mid = (first + last) / 2;
		while(first <= last) {
			if(array[mid] < search) {
				first = mid + 1;
			}
			else if(array[mid] == search) {
				return mid;
			}
			else
				last = mid - 1;
			mid = (first + last) / 2;
		} 
		return -1;
	}
	public static void main(String... args) {
		int[] array = {10, 40, 30, 1, 50, 100, 90, 70, 68};
		Arrays.sort(array);
		System.out.println("Array after sorting");
		for(int i = 0; i < array.length; i++) 
			System.out.print(array[i] + " ");
		System.out.println();
		int search = 68;
		int first = 0;
		int last = array.length - 1;
		System.out.println(search + " is in the index: " + binarySearch(array, first, last, search) + " of the given array");
	}
}
