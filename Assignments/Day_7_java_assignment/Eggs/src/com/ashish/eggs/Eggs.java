package com.ashish.eggs;

public class Eggs {
int N;
public void setN(int n) {
	N = n;
}
public void Count()
{	int temp;
	temp=N%144;
	System.out.println("Gross : "+N/144); 
	System.out.println("Dozen : "+temp/12);
	System.out.println("Remaining : "+temp%12);
	}

}
