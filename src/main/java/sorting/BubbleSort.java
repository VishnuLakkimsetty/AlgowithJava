/**
 * Logic is to compare the adjacent and swap them if the first element is higher than second element
 * 
 * After each iteration the highest value will go to its actual place
 */

package main.java.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {100,22,65,76,5,30};
		
		// Printing Array before sorting'
		System.out.println("Arrays before sorting is :: ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +"\t");
		}
		System.out.println();
		
		// Sorting using Bubble sort Algorithm
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println("Array after "+(i+1)+"th iteration is :: ");
			for(int k=0;k<a.length;k++) {
				System.out.print(a[k] +"\t");
			}
			System.out.println();
		}
	}
}
