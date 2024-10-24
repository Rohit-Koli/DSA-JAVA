package com.sortingAlgos;

public class SelectionSort {
	public static int[] selectionSortSolution(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {6,9,1,5,90,2};
		
		int resArr[]=selectionSortSolution(arr);
		for(int i:resArr) {
			System.out.print(i+" ");
			
		}
	}
}
