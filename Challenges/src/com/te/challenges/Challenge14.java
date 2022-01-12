package com.te.challenges;

import java.util.Scanner;

public class Challenge14 {
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		int result1 = 0;
		int result2 = 1;
		int big_bag_weight = bigCount * 5;
		int small_bag_weight = smallCount * 1;
		int tweight = big_bag_weight + small_bag_weight;
		result1 = tweight % 9;
		if (small_bag_weight != 0) {
			result2 = (big_bag_weight + (small_bag_weight - 1)) % 9;
		}
		if (result1 == 0) {
			return true;
		} else if (result2 == 0) {
			return true;

		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Big Count");
		int bigCount = sc.nextInt();
		System.out.println("Enter Small Count");
		int smallCount = sc.nextInt();
		int goal = 11;
		boolean result;
		if (bigCount >= 0 && smallCount >= 0) {
			result = canPack(bigCount, smallCount, goal);
			System.out.println(result);
		} else {
			System.out.println("Enter valid data");
		}

	}
}
