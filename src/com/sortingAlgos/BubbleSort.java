package com.sortingAlgos;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {56,90,2,45,11,7,9,1};
		int resArr[]=bubbleSortSolution(arr);
		for(int i:resArr) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] bubbleSortSolution(int arr[]) {
		for(int i=1;i<arr.length;i++) {			
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}		
		return arr;
	}
}
