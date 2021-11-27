package com.bridgeit;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
	
public static void main(String[] args) {
	
	String word1;
	String word2;
	boolean check = false;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Word to check anagram: ");
	word1 = sc.next();
	System.out.println("Enter the Second word to check anagram: ");
	word2 = sc.next();
	
	if (word1.length() == word2.length())
		check = isAnagram(word1, word2);
	System.out.println(check);

}

private static boolean isAnagram(String word1, String word2) {

	char[] w1 = word1.replaceAll("[\\s]", "").toCharArray();
	char[] w2 = word2.replaceAll("[\\s]", "").toCharArray();
	Arrays.sort(w1);
	Arrays.sort(w2);
	boolean check=Arrays.equals(w1, w2);
	return check;
}

}

