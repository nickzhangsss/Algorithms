//: org.zxlstudios.algorithms.sorting.InsertionSort.java
package org.zxlstudios.algorithms.sorting;

/*
 * Sort integers by using insertion algorithm.
 * @author Xulong Zhang
 * @version 1.0
 * 
 */
public class InsertionSort {

	/*
	 * A method that implements Insertion Sort algorithm
	 * 
	 * @param A An unsorted integer array
	 */
	public static void insertionSort(int[] A) {
		for (int j = 1; j < A.length; j++) {
			// save the current element
			int key = A[j];
			// use this statement to remember the current the position. It
			// improves performance.
			int i = j - 1;
			// move every element in front of the current element one position
			// backwards if its value is less than the current element's
			while (i >= 0 && key < A[i]) {
				A[i + 1] = A[i];
				i--;
			}
			// insert the saved element into current position
			A[i + 1] = key;
		}
	}

}
// :~