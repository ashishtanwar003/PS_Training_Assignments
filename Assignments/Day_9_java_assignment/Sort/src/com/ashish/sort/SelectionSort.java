package com.ashish.sort;

public class SelectionSort {
	
	        
	    public static void main(String args[])
	    {
	        SelectionSort ob = new SelectionSort();
	        int arr[] = {61,15,11,24,91};
	        int n = arr.length;
	   	 
		       for (int i = 0; i < n-1; i++)
		        {
		           int min_idx = i;
		            for (int j = i+1; j < n; j++)
		                if (arr[j] < arr[min_idx])
		                    min_idx = j;
		 
		            int temp = arr[min_idx];
		            arr[min_idx] = arr[i];
		            arr[i] = temp;
		        }
	        System.out.println("Sorted array");
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	}

