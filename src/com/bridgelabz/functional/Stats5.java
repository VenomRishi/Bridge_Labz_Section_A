package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double tempMin = 0.0, tempMax = 0.0,sum=0.0,avg=0.0;
		double fiveRandomNumberArray[] = new double[5];
		for (int i = 0; i < fiveRandomNumberArray.length; i++) {
			fiveRandomNumberArray[i] = utility.MathRandomNumber();
		}
		System.out.println("Random Number");
		for (int i = 0; i < fiveRandomNumberArray.length; i++) {
			System.out.println(fiveRandomNumberArray[i]);
		}
		
//		for finding avarage
		for(int i=0;i<fiveRandomNumberArray.length;i++) {
			sum+=fiveRandomNumberArray[i];
		}
		avg=sum/5;
		System.out.println("Average : "+avg);

		// for finding minimum from array
		tempMin = utility.MathMinNumber(fiveRandomNumberArray[0], fiveRandomNumberArray[1]);
		for (int i = 2; i < fiveRandomNumberArray.length; i++) {
			tempMin = utility.MathMinNumber(tempMin, fiveRandomNumberArray[i]);

		}
		System.out.println("Min Value :" + tempMin);
//		for finding minimum from array
		tempMax = utility.MathMaxNumber(fiveRandomNumberArray[0], fiveRandomNumberArray[1]);
		for (int i = 2; i < fiveRandomNumberArray.length; i++) {
			tempMax = utility.MathMaxNumber(tempMax, fiveRandomNumberArray[i]);

		}
		System.out.println("Max Value :" + tempMax);

	}

}
