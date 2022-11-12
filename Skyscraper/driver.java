package com.gradedcodingassignment.DSA1.Skyscraper;

import java.util.Scanner;

import com.gradedcodingassignment.DSA1.Services.Services;

public class driver {

	public static void main(String[] args) {
		System.out.println("enter the total no of floors in the building ");
		try (Scanner sc = new Scanner(System.in)) {
			int numberOfFloors = sc.nextInt();
			int[] listOfFloors = new int[numberOfFloors];
			for (int i = 0; i < numberOfFloors; i++) {
				System.out.println("enter the floor size given on day : " + (i + 1));
				int floorSize = sc.nextInt();
				listOfFloors[i] = floorSize;

			}
			System.out.println();
			System.out.println("The order of construction is as follows");
			Services.calculateFloors(listOfFloors);

		}
	}

}