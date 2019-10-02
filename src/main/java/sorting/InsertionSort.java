/**
 * This is similar to arranging cards in sequence in a deck of playing cards
 * 
 * For this logic, compare the element at it index with prior elements
 */

package main.java.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a = {100,22,65,76,5,30};

		// Printing Array before sorting'
		System.out.println("Arrays before sorting is :: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();

		// Sorting using Insertion sort Algorithm
		for(int i=1;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[i]<a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
 				}
			}
			System.out.println("Array after "+i+"th iteration is :: ");
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k] +"\t");
			}
			System.out.println();
		}
	}
}
