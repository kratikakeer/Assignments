package com.te.challenges;

import java.util.Scanner;

public class Challenge15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width of wall");
		double width = scan.nextDouble();
		System.out.println("Enter height of wall");
		double height = scan.nextDouble();
		System.out.println("Enter buckets available at home");
		double available_bucket = scan.nextDouble();
		System.out.println("Enter area coverd by per bucket");
		double per_bucke_area = scan.nextDouble();
		double total_area = width * height;

		double area_painted = total_area - (available_bucket * per_bucke_area);
		for (double bucket = 1; bucket <= 10; bucket++) {
			System.out.print(area_painted);
			area_painted = area_painted - (per_bucke_area * bucket);
			if (area_painted <= 0) {
				break;
			}
		}

	}

}
