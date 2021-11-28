package com.ashish.dictionary;
import java.util.*;
public class Dictionary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Map<String,String> dict= new HashMap<String,String>();
	dict.put("analysis", "abstract separation of something into its various parts");
	dict.put("approach", "move towards");
	dict.put("assume","take to be the case or to be true");
	dict.put("create", "bring into existance");
	dict.put("data", "a collection of facts from which conclusions may be drawn ");
	
	System.out.println("Enter the word : ");
	String inp=new String();
	inp=sc.next();
	System.out.println("Meaning : "+dict.get(inp));
	
}
}
