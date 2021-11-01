package com.qa.hello;

import com.qa.trainee.DFETrainee;

public class Runner {
	public static void main(String[] args) {
		
		DFETrainee jordan = new DFETrainee(22, "Jordan");
		
		DFETrainee doniel = new DFETrainee(23, "Doniel");
		
		System.out.println("Name is = " + jordan.name);
		System.out.println("Age is = " + jordan.age);
		
		System.out.println("Name is = " + doniel.name);
		System.out.println("Age is = " + doniel.age);
	}
}
