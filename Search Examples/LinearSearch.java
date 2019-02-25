public class LinearSearch {
	public static int linearSearch(int[] array, int search) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == search) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String... args) {
		int[] array = {10, 20, 30, 40, 50, 100, 60, 80, 90, 70};
		int search = 45;
		System.out.println(search + " is found in index: " + linearSearch(array, search) + " of the given array");
	}
}
