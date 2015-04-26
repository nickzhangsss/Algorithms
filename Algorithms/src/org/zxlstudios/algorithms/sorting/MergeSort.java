//: org.zxlstudios.algorithms.sorting.MergeSort.java
package org.zxlstudios.algorithms.sorting;

/*
 * Sort integers by using merge algorithm.
 * @author Xulong Zhang
 * @version 1.0
 * 
 */
public class MergeSort {

	public static void mergeSort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}

	public static void merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] L = new int[n1 + 1], R = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			L[i] = A[p + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = A[q + j + 1];
		}
		L[n1] = -1; R[n2] = -1;
		int i = 0, j = 0;
		for (int k = p; k <= r; k++) {
			if (L[i] == -1) {
				A[k] = R[j];
				j++;
			} else if (R[j] == -1) {
				A[k] = L[i];
				i++;
			} else {
				if (L[i] <= R[j]) {
					A[k] = L[i];
					i++;
				} else {
					A[k] = R[j];
					j++;
				}
			}

		}
	}

}
//:~