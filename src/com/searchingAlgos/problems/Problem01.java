package com.searchingAlgos.problems;

/*
 * Question :
 * First and Last Position of an Element in Sorted Array
 * Input :
 * array
 * 0 5 5 6 6 6
 * element to find
 * 6
 * Output:
 * 3 5
 * First, Last
 * Input :
 * 0 0 1 2 3 0
 * 5
 * Output:
 * -1(If Element is Not Present in Array) 
 */
public class Problem01 {
	public static void main(String[] args) {
		int arr[]= {0 ,5, 5, 6, 6, 6};
		int ele=6;
		solution(arr,ele);
	}
	public static void solution(int arr[],int ele) {
		int firstOccurence=-1;
		int lastOccurence=-1;
		int start=0;
		int end=arr.length-1;
		int mid=(start+end)/2;
		while(start<=end) {
			if(arr[mid]==ele) {
				firstOccurence=mid;
				if(firstOccurence!=mid) {
					lastOccurence=mid;
					break;
				}
			}
			
			if(arr[mid]<ele) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		if(firstOccurence!=-1 && lastOccurence!=-1) {
			System.out.println(firstOccurence+""+lastOccurence);
		}else {
			System.out.println("-1 -1");
			
		}
	}
}
