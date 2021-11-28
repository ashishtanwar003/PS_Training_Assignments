package com.ashish.arraylist;

import java.util.*;

public class SumAverage {
public static void main(String[] args) {
	int sum=0;
	ArrayList <Integer> A= new ArrayList<Integer>();
	A.add(20);
	A.add(30);
	A.add(40);
	A.add(50);
	for(Integer i:A) {
		sum+=i;
	}
	System.out.println("Sum= "+sum);
	System.out.println("Average = "+sum/A.size());
}
}
