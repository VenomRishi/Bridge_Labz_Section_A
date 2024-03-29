/******************************************************************************
 *  Purpose: This is utility file which contains logic for functional files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {

	/**
	 * Purpose: Method is written for addition of two integer
	 * 
	 * @param firstNumber  first integer input is taken
	 * @param secondNumber second integer input is taken
	 * 
	 * @return return result result will return sum of firstNumber and secondNumber
	 */
	public int sumOfTwoIntegers(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		return result;

	}

	/**
	 * Purpose: Method is written for Integer Operation a + b * c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation1(int a, int b, int c) {
		int result = a + b * c;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation a * b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation2(int a, int b, int c) {
		int result = a * b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation c + a / b
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * @return result mathematical expression written in method
	 */
	public int IntOperation3(int a, int b, int c) {
		int result = c + a / b;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation a % b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation4(int a, int b, int c) {
		int result = a % b + c;
		return result;
	}

	/***********************************************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	/**
	 * Purpose: Method is written for Double Operation a + b * c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation1(double a, double b, double c) {
		double result = a + b * c;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation a * b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation2(double a, double b, double c) {
		double result = a * b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation c + a / b
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation3(double a, double b, double c) {
		double result = c + a / b;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation a % b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation4(double a, double b, double c) {
		double result = a % b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Leap Year validation input accept from 1582 to
	 * 9999
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean LeapYearValidation(int year) {
		if (year >= 1582 && year <= 9999) {
			return true;
		}
		return false;

	}

	/**
	 * Purpose: Method is written for Given Year is Leap Year or Not
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean LeapYear(int year) {

		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Purpose: Method is written for Checking Validation leap Year or not and by
	 * Calendar wise it will give days back to method where definition is there
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean CheckValidationForSpringSeason(int month, int day, boolean leapYear) {

		switch (month) {
		case 1:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 2:
			if (leapYear) {
				if (day > 0 && day <= 29) {
					return true;
				} else {
					return false;
				}

			} else {
				if (day > 0 && day <= 28) {
					return true;
				} else {
					return false;
				}
			}

		case 3:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 4:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 5:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 6:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 7:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 8:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 9:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 10:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 11:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 12:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		default:
			System.out.println("Please enter valid input");
		}
		return false;

	}

	/**
	 * Purpose: Method is written for finding Spring Season
	 * 
	 * @param month month will be taken from user from 1 to 12
	 * @param day   day will be taken from user from 1 to 31
	 * @return if SpringSeason return true else return false
	 */
	public boolean CheckSpringSeason(int month, int day) {

		if (month == 3) {
			if (day >= 20) {
				return true;
			}
		} else if (month == 4) {
			if (day > 0 && day <= 30) {
				return true;
			}
		} else if (month == 5) {
			if (day > 0 && day <= 31) {
				return true;
			}
		} else if (month == 6) {
			if (day <= 20) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Purpose: Method is written for finding delta for Quadratic Equation
	 * 
	 * @param a input a
	 * @param b input b
	 * @param c input c
	 * @return delta finding delta using formula
	 */

	public double FindDelta(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		return delta;
	}

	/**
	 * Purpose: Method is written for finding first Quadratic Equation
	 * 
	 * @param a
	 * @param b
	 * @param sqrtDelta
	 * @return
	 */
	public double QuadraticEquation1(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation1 = (-b + sqrtDelta) / (2 * a);
		return equation1;
	}

	/**
	 * Purpose: Method is written for finding second Quadratic Equation
	 * 
	 * @param a
	 * @param b
	 * @param delta
	 * @return
	 */
	public double QuadraticEquation2(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation2 = (-b - sqrtDelta) / (2 * a);
		return equation2;
	}

	/**
	 * Purpose: Method is written for finding Euclidean Distance From Origin
	 * 
	 * @param x1 input 0
	 * @param y1 input 0
	 * @param x2 input taken from user
	 * @param y2 input taken from user
	 * @return distance function will calculate the distance and return it
	 */
	public double EuclideanDistance(int x1, int y1, int x2, int y2) {
		double distance, powerofx, powerofy, sumOfPowerXY;
		int x, y;
		x = x2 - x1;
		y = y2 - y1;
		powerofx = Math.pow(x, 2);
		powerofy = Math.pow(y, 2);

		sumOfPowerXY = powerofx + powerofy;

		distance = Math.sqrt(sumOfPowerXY);
		return distance;
	}

	/**
	 * Purpose: Method is written for getting random number
	 * 
	 * @param min take input 1
	 * @param max take input 6
	 * @return random finds random number and return it.
	 */
	public int getRandomNumber(int min, int max) {
		/*
		 * Random random = new Random(); return random.nextInt((max - min) + 1) + min;
		 */
		int range = max - min + 1;
		int random = (int) (Math.random() * range) + 1;
		return random;

	}

	/**
	 * Purpose: Method is written for Converting Temperature Fahrenheit to Celsius
	 * 
	 * @param temperatureInFerenheit
	 * @return temperatureInCelcius return temperature in celsius
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/**
	 * Purpose: Method is written for Converting Temperature Celcius to Fahrenheit
	 * 
	 * 
	 * @param temperatureInCelsius
	 * @return temperatureInFahrenheit return temperature in fahrenheit
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	/**
	 * Purpose: This method will calculate the EMI for the month on the basis of
	 * loan amount for particular year and it will be depend upon the rate of
	 * interest given for the loan.
	 * 
	 * @param principalLoanAmount input taken for principal amount of loan
	 * @param year                input taken for how much year of loan
	 * @param rOI                 input taken for interest for the loan
	 * @return paymentAmountForMonth
	 * 
	 *         in this it calculating the amount to pay for every month
	 */
	public double LoanCalculator(int principalLoanAmount, int year, double rOI) {

		double payment, r;
		int n;
		n = 12 * year;
		r = (rOI / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}

	/**
	 * Purpose: Generate Random Number using Math.random() method
	 * 
	 * @return return random number
	 */
	public double mathRandomNumber() {

		return Math.random();
	}

	/**
	 * Purpose: Finding Minimum between two number using Math.min() method
	 * 
	 * @param a input of array index 1st
	 * @param b input of array index 2st
	 * @return compare and return minimum between two
	 */
	public double mathMinNumber(double a, double b) {
		return Math.min(a, b);
	}

	/**
	 * Purpose: Finding Maximum between two number using Math.max() method
	 * 
	 * @param a input of array index 1st
	 * @param b input of array index 2st
	 * @return compare and return maximum between two
	 */
	public double mathMaxNumber(double a, double b) {
		return Math.max(a, b);
	}

	/**
	 * Purpose: Reversing the String Array
	 * 
	 * @param namesArray    getting array from the user input
	 * @param start         this parameter tells the starting array index
	 * @param lengthOfArray this parameter tells the ending array index
	 * @return reverseArray it returns the reverse String array
	 */
	public String[] ReverseStringArray(String[] namesArray, int start, int lengthOfArray) {

		// for reversing the nameArray

		String temp;
		while (start < lengthOfArray) {
			temp = namesArray[start];
			namesArray[start] = namesArray[lengthOfArray];
			namesArray[lengthOfArray] = temp;
			start++;
			lengthOfArray--;
		}
		return namesArray;
	}

	/**
	 * Purpose: To Perform Trigonometry operation on the basis of degree it will
	 * give radians
	 * 
	 * @param degree input is taken from user
	 * @return returns radian of that degree
	 */
	public double findRadiun(int degree) {
		return Math.toRadians(degree);
	}

	/**
	 * Purpose: To find sin of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns sin of that radian
	 */
	public double findSin(double radiun) {
		return Math.sin(radiun);
	}

	/**
	 * Purpose: To find cos of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns cos of that radian
	 */
	public double findCos(double radiun) {
		return Math.cos(radiun);
	}

	/**
	 * Purpose: To find tan of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns tan of that radian
	 */
	public double findTan(double radiun) {
		return Math.tan(radiun);
	}

	/**
	 * Purpose: To find cot of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns cot of that radian
	 */
	public double findCot(double radiun) {
		double cot;
		cot = 1 / Math.tan(radiun);
		return cot;
	}

	/**
	 * Purpose: To find sec of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns sec of that radian
	 */
	public double findSec(double radiun) {
		double sec;
		sec = 1 / Math.cos(radiun);
		return sec;
	}

	/**
	 * Purpose: To find cosec of trigonometry
	 * 
	 * @param radiun radian is taken from previous method
	 * @return returns csc of that radian
	 */
	public double findCosec(double radiun) {
		double csc;
		csc = 1 / Math.sin(radiun);
		return csc;
	}

	public double velocityIntoSpeed(int velocity) {
		double speed;
		speed = velocity * 0.609;
		return speed;
	}

	/**
	 * Purpose:
	 * 
	 * @param temperatureInFahrenheit
	 * @param speed
	 * @return
	 */
	public double CalculateWindChill(double temperatureInFahrenheit, double speed) {
		double a, windChill, b, c;
		a = 0.615 * temperatureInFahrenheit;
		b = 0.4275 * temperatureInFahrenheit;
		c = b - 35.75;
		windChill = 35.74 + a + c * speed;
		// windchill cannot be negative
		windChill = Math.abs(windChill);
		return windChill;
	}

	/**
	 * Purpose: To Calculate Day Of a Week
	 * 
	 * @param day   input taken from user
	 * @param month input taken from user
	 * @param year  input taken from user
	 * @return dayOfWeek return day for week like Monday Tuesday
	 */
	public int CalculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}

	/**
	 * @param number
	 * @param powerValue
	 * @return
	 */
	public int PowerOfTwo(int number, int powerValue) {
		int result;
		result = (int) Math.pow(number, powerValue);
		return result;
	}

	/**
	 * @param number
	 */
	public void PrintHarmonic(int number) {
		System.out.print("H=");
		for (int i = 1; i <= number; i++) {
			if (i != number) {
				System.out.print("1/" + i);
				System.out.print(" + ");
			} else {
				System.out.print("1/" + i);
			}

		}

	}

	/**
	 * @param c
	 * @return
	 */
	public double findSquareRootUsingNewtonsMethod(int c) {
		double t, epsilon;
		t = c;
//		epsilon=1*(Math.pow(10, -15));
		epsilon = 1e-15;

		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}

	/**
	 * @param numberForCoinFlip
	 */
	public void FlipCoin(int numberForCoinFlip) {
		double percentageOfHeads, percentageOfTails;
		int headsCount = 0, tailsCount = 0;

		for (int i = 1; i <= numberForCoinFlip; i++) {
			if (Math.random() < .5) {
				System.out.println("Heads");
				headsCount++;
			} else {
				System.out.println("Tails");
				tailsCount++;
			}
		}
		percentageOfHeads = (int) headsCount * 100 / numberForCoinFlip;
		percentageOfTails = (int) tailsCount * 100 / numberForCoinFlip;
		System.out.println("Percentage of Heads is : " + percentageOfHeads);
		System.out.println("Percentage of Tails is : " + percentageOfTails);

	}

	/**
	 * @param number
	 * @return
	 */
	public boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

	public double CalculateAngleX(int x) {

		return x % (2 * 180);
	}

	/**
	 * @param angleX
	 * @param noOddSeries
	 */
	public void PrintSinXSeries(double angleX, int noOddSeries) {

		int count = 1;

		System.out.print("Sin(" + angleX + ") = ");
		System.out.print(angleX + " - ");
		for (int i = 3; i <= noOddSeries;) {
			if (count % 2 != 0) {
				System.out.print(Math.pow(angleX, i) + " / " + CalculateFactorial(i));
				if (i != noOddSeries) {
					System.out.print(" + ");
				}

				count++;

			} else {
				System.out.print(Math.pow(angleX, i) + " / " + CalculateFactorial(i));
				if (i != noOddSeries) {
					System.out.print(" - ");
				}
				count++;
			}
			i = i + 2;

		}

	}

	/**
	 * @param number
	 * @return
	 */
	public int CalculateFactorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}

	/**
	 * @param angleX
	 * @param noEvenSeries
	 */
	public void PrintCosXSeries(double angleX, int noEvenSeries) {
		int count = 1;

		System.out.print("Sin(" + angleX + ") = ");
		System.out.print("1 - ");
		for (int i = 2; i <= noEvenSeries;) {
			if (count % 2 == 0) {
				System.out.print(Math.pow(angleX, i) + " / " + CalculateFactorial(i));
				if (i != noEvenSeries) {
					System.out.print(" + ");
				}

				count++;

			} else {
				System.out.print(Math.pow(angleX, i) + " / " + CalculateFactorial(i));
				if (i != noEvenSeries) {
					System.out.print(" - ");
				}
				count++;
			}
			i = i + 2;

		}

	}

	/**
	 * @param stake
	 * @param goals
	 * @param days
	 */
	public void GamlingSimulation(int stake, int goals, int days) {

		int tempStake = stake;
		int trails = 0;
		int win = 0;
		int percentageWin;
		for (int i = 0; i <= days; i++) {
			while (tempStake > 0 && tempStake < goals) {
				if (Math.random() > 0.5) {
					tempStake++;
					trails++;
//					countWin++;
				} else {
					tempStake--;
					trails++;
//					countLoose++;
				}
				if (tempStake == goals)
					win++;
			}

		}
		percentageWin = win * 100 / days;

		System.out.println("Gamler Won :" + win + " times");
		System.out.println("Percentage of Winning is :" + percentageWin);
		System.out.println("Avg bets made :" + trails / days);

	}

	/**
	 * @param numberArray
	 * @return
	 */
	public int findRepeatedInArray(int[] numberArray) {

		for (int i = 0; i < numberArray.length; i++) {
			for (int j = i + 1; j < numberArray.length; j++) {
				if (numberArray[i] == numberArray[j]) {
					return numberArray[i];
				}
			}
		}
		return 0;

	}

	/**
	 * @param numberArray
	 * @return
	 */
	public int findSecondSmaller(int[] numberArray) {
		int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] < smallest) {
				secondSmallest = smallest;
				smallest = numberArray[i];
			} else if (numberArray[i] < secondSmallest && numberArray[i] != smallest) {
				secondSmallest = numberArray[i];
			}
		}
		return secondSmallest;
	}

	/**
	 * @param numberArray
	 * @return
	 */
	public int findSecondLargest(int[] numberArray) {
		int largest=0,secondLargest=0;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] > largest) {
				secondLargest = largest;
				largest = numberArray[i];
			} else if (numberArray[i] > secondLargest && numberArray[i] != largest) {
				secondLargest = numberArray[i];
			}
		}
		return secondLargest;
	}

	public void printKPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 13; j++) {
				if (i == 1) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");

				}
				if (i == 2) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
//					else if (j > 9 && j <= 11)
//						System.out.print("*");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 3) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 4) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 5) {
					if (j > 5 && j <= 13)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 6) {
					if (j > 2 && j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 7)
						System.out.print("*");
					else if (j > 7)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 7) {
					if (j > 2 && j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 9)
						System.out.print("*");
					else if (j > 9)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 8) {
					if (j > 2 && j <= 8)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				if (i == 9) {
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else
						System.out.print("*");
				}

			}
			System.out.println();
		}

	}

	public void printDPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 15; j++) {
				switch (i) {
				case 1:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 3:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 5:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 6:
					if (j > 2 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 15)
						System.out.print("*");
					else
						System.out.print("*");
					break;
				case 7:
					if (j > 2 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j > 2 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j > 10 && j <= 15)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}

	public void printWPattern() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 32; j++) {
				switch (i) {
				case 1:
					if (j > 2 && j <= 15)
						System.out.print(" ");
					else if (j == 16)
						System.out.print("*");
					else if (j > 16 && j <= 29)
						System.out.print(" ");
					else if (j > 29 && j <= 31)
						System.out.print("*");
					else if (j == 32)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 2:
					if (j == 1)
						System.out.print(" ");
					else if (j > 1 && j <= 3)
						System.out.print("*");
					else if (j > 3 && j <= 14)
						System.out.print(" ");
					else if (j > 14 && j <= 17)
						System.out.print("*");
					else if (j > 17 && j <= 28)
						System.out.print(" ");
					else if (j > 28 && j <= 30)
						System.out.print("*");
					else if (j > 30)
						System.out.print(" ");
					else
						System.out.print("*");

					break;
				case 3:
					if (j <= 2)
						System.out.print(" ");
					else if (j > 2 && j <= 4)
						System.out.print("*");
					else if (j > 4 && j <= 13)
						System.out.print(" ");
					else if (j > 13 && j <= 15)
						System.out.print("*");
					else if (j == 16)
						System.out.print(" ");
					else if (j > 16 && j <= 18)
						System.out.print("*");
					else if (j > 18 && j <= 27)
						System.out.print(" ");
					else if (j > 27 && j <= 29)
						System.out.print("*");
					else if (j > 29)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 4:
					if (j <= 3)
						System.out.print(" ");
					else if (j > 3 && j <= 5)
						System.out.print("*");
					else if (j > 5 && j <= 12)
						System.out.print(" ");
					else if (j > 12 && j <= 14)
						System.out.print("*");
					else if (j > 14 && j <= 17)
						System.out.print(" ");
					else if (j > 17 && j <= 19)
						System.out.print("*");
					else if (j > 19 && j <= 26)
						System.out.print(" ");
					else if (j > 26 && j <= 28)
						System.out.print("*");
					else if (j > 28)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 5:
					if (j <= 4)
						System.out.print(" ");
					else if (j > 4 && j <= 6)
						System.out.print("*");
					else if (j > 6 && j <= 11)
						System.out.print(" ");
					else if (j > 11 && j <= 13)
						System.out.print("*");
					else if (j > 13 && j <= 18)
						System.out.print(" ");
					else if (j > 18 && j <= 20)
						System.out.print("*");
					else if (j > 20 && j <= 25)
						System.out.print(" ");
					else if (j > 25 && j <= 27)
						System.out.print("*");
					else if (j > 27)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 6:
					if (j <= 5)
						System.out.print(" ");
					else if (j > 5 && j <= 7)
						System.out.print("*");
					else if (j > 7 && j <= 10)
						System.out.print(" ");
					else if (j > 10 && j <= 12)
						System.out.print("*");
					else if (j > 12 && j <= 19)
						System.out.print(" ");
					else if (j > 19 && j <= 21)
						System.out.print("*");
					else if (j > 21 && j <= 24)
						System.out.print(" ");
					else if (j > 24 && j <= 26)
						System.out.print("*");
					else if (j > 26)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 7:
					if (j <= 6)
						System.out.print(" ");
					else if (j > 6 && j <= 8)
						System.out.print("*");
					else if (j > 8 && j <= 9)
						System.out.print(" ");
					else if (j > 9 && j <= 11)
						System.out.print("*");
					else if (j > 11 && j <= 20)
						System.out.print(" ");
					else if (j > 20 && j <= 22)
						System.out.print("*");
					else if (j > 22 && j <= 23)
						System.out.print(" ");
					else if (j > 23 && j <= 25)
						System.out.print("*");
					else if (j > 25)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 8:
					if (j <= 7)
						System.out.print(" ");
					else if (j > 7 && j <= 10)
						System.out.print("*");
					else if (j > 10 && j <= 21)
						System.out.print(" ");
					else if (j > 21 && j <= 24)
						System.out.print("*");
					else if (j > 24)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				case 9:
					if (j <= 8)
						System.out.print(" ");
					else if (j == 9)
						System.out.print("*");
					else if (j > 9 && j <= 22)
						System.out.print(" ");
					else if (j == 23)
						System.out.print("*");
					else if (j > 23)
						System.out.print(" ");
					else
						System.out.print("*");
					break;
				}
			}
			System.out.println();
		}

	}

	public int SwapNibbles(int decToBinary) {
		return (((decToBinary & 0x0F) << 4) | ((decToBinary & 0xF0) >> 4));

	}

}
