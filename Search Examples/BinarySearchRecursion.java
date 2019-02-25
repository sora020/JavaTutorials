import java.util.Arrays;
public class BinarySearchRecursion { 
	public static int binarySearch(int[] array, int first, int last, int search) {
		if(last >= first) {
			int mid = first + (last - first)/2;
			if(array[mid] == search) 
				return mid;
			else if(array[mid] > search) 
				return binarySearch(array, first, mid - 1, search);
			else
				return binarySearch(array, mid + 1, last, search);
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
