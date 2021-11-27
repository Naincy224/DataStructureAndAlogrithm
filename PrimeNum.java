package com.bridgeit;

import java.util.Scanner;

public class PrimeNum {

	public int num;
	
	public static int isPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number between 1-1000 : ");
		int num = sc.nextInt();
		if (num <= 1000) {
			int check = isPrime(num);
			if (check == 2) {
				System.out.println(num + " is a Prime Number");
			} else {
				System.out.println(num + " is not a Prime Number");
			}
		}
		else
			System.out.println("please enter no. between 1-1000 to check prime");
	}
}
