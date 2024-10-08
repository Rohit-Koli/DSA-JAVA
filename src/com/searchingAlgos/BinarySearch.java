package com.searchingAlgos;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= {14,23,34,45,67,78,89,90};
		int targetEle=67;
		System.out.println("Element is Present at "+binarySea(arr,targetEle));
	}
	public static int binarySea(int arr[],int targetEle) {
		int start=0;
		int end=arr.length-1;
		int mid=start+end/2;
		while(start<=end) {
			if(arr[mid]==targetEle) {
				return mid;
			}				
			if(arr[mid]>targetEle) {
				end=mid-1;
			}else {
				start=mid+1;
			}
			mid=(start+end)/2;
		}
		return -1;
	}
}
