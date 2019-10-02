/**
 * It  is based on the idea of finding the minimum or maximum element in an unsorted array 
 * and then putting it in its correct position in a sorted array.
 * 
 * So first find the index of smallest element and swap it with the elements of its corresponding place
 */

package main.java.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {100,22,65,76,5,30};

		// Printing Array before sorting'
		System.out.println("Arrays before sorting is :: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();

		// Sorting using Insertion sort Algorithm

		for(int i=0;i<a.length;i++) {
			int index = i;
			for(int j=i;j<a.length;j++) {
				if(a[j]<a[index]) {
					index = j;
				}
			}

			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;

			System.out.println("Array after "+(i+1)+"th iteration is :: ");
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k] +"\t");
			}
			System.out.println();
		}

	}
}
