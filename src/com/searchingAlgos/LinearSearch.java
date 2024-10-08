package com.searchingAlgos;

public class LinearSearch {
	public static void main(String[] args) {
		/*This is the simplest Searching Algorithm
		 * It compares array element with target element with one by one 
		 * Time Complexity is O(n)
		 */
		int arr[]= {546,23,89,56,2};
		int ele=56;
		System.out.println("Array Element is Located on Index :"+searchElement(arr,ele));
	}
	public static int searchElement(int arr[],int ele) {
		int i=0;
		for(;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;
	}
}
