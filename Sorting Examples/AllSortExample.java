/**
 * importing Scanner class
 */

import java.util.Scanner;

/**
 * sorting class
 */
class Sort {

	/**
	 * Bubble Sort Algorithm method
	 */
	int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * Selection Sort Algorithm method
	 */
	int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j])
					min = j;
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}

	/**
	 * Insertion Sort Algorithm method
	 */
	int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				} else
					break;
			}
		}
		return array;
	}
	int[] shellSort(int[] array) {
		// h should be strictly less than array.length
		int h = 1;
		while(h < (array.length/3)) {
			h = h*3 + 1;
		}
		while(h >= 1) {
			for(int i = h; i < array.length; i++) {
				// h-sort the array
       				// Iterate through elements from right to left, moving h steps back.
				for(int j = i; j >= h; j = j - h) {
					if(array[j] < array[j-h]) {
						int temp = array[j];
						array[j] = array[j-h];
						array[j-h] = temp;
					}
					else
						break;
				}
			}
			h = h/3;
		}
		return array;
	}
};

/**
 * driver class
 */
public class AllSortExample {

	/**
	 * choice method
	 */
	public static void switchChoice(int[] array, int userch) {
		Sort s = new Sort();
		switch (userch) {
			case 1:
				System.out.println("The Array after Bubble sorting the element: ");
				/**
				 * calling bubbleSort() method in class Sort and passing the
				 array to printArray method*/
				printArray(s.bubbleSort(array));
				break;
			case 2:
				System.out.println("The Array after Selection sorting the element: ");
				/**
				 * calling selectionSort() method in class Sort and passing
				 the array to printArray method*/
				printArray(s.selectionSort(array));
				break;
			case 3:
				System.out.println("The Array after Insertion sorting the element: ");
				/**
				 * calling insertionSort() method in class Sort and passing the
				 array to printArray method*/
				printArray(s.insertionSort(array));
				break;
			case 4: 
				System.out.println("The Array after Shell sorting the element: ");
				/**calling shellSort() method in class Sort and passing the
				 array to printArray method*/
				printArray(s.shellSort(array));
				break;
			default:
				System.out.println("Wrong Choice");
		}
	}

	/**
	 * Array print method
	 */
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}

	/**
	 * driver method
	 */
	public static void main(String... args) {
		int n, userch;
		char ch, ch1;

		/**Creating Scanner class object
		 */
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter length of the Array: ");
			n = sc.nextInt();

			/**Declaring array to store the elements/values
			 */
			int[] array = new int[n];

			System.out.println("Enter Elements in Array: ");
			for (int i = 0; i < n; i++) {
				array[i] = sc.nextInt();
			}

			/**Showing array entered by user
			 */
			System.out.println("You have Entered the following Elements: ");
			printArray(array);

			/**taking Operation choice input from user and passing
			 * it to switchChoice method
			 * */
			do {
				System.out.println("\nWhat sorting type you want to perform: " +
					"\n1. Bubble Sort" +
					"\n2. Selection Sort" +
					"\n3. Insertion Sort" + 
					"\n4. Shell Sort");
				System.out.println("Enter your choice: ");
				userch = sc.nextInt();
				switchChoice(array, userch);
				System.out.println("\nPress y to enter your choice again or n to" +
					" continue with the program");
				ch1 = sc.next().charAt(0);
			} while (ch1 == 'y' || ch1 == 'Y');
			/**Continue the program without stopping
			 */
			System.out.println("\nDo you want to enter elements again: " +
				"\nPress y for 'yes' or n to close the program");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
};
