package com.dsa;

public class ThirdHighestElementInArray {

	public static void main(String[] args) {
		
		int temp=0;
		int[] arr = {36,48,18,14,7};
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted array in acesending order");
		for(int i= 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		if(arr.length>=3) {
			System.out.println("Third highest element is:"+ arr[arr.length-3]);
		}else {
			System.out.println("Array doesn't have enough element to find the third highest element");
		}
		

	}

}
