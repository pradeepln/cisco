package com.cisco.training.basics;

public class DOWFinder {
	
	public String findDOW(int day,int month,int year) {
		
		int numDays = 0;
		
		numDays = (year - 1900) * 365;
		
		numDays += (year - 1900)/4;
		
		switch(month) {
		case 12: 
			numDays += 30;
		case 11:
			numDays += 31;
		case 10: 
			numDays += 30;
		case 9:
			numDays += 31;
		case 8: 
			numDays += 31;
		case 7:
			numDays += 30;
		case 6: 
			numDays += 31;
		case 5:
			numDays += 30;
		case 4: 
			numDays += 31;
		case 3:
			numDays += 28;
		case 2:
			numDays += 31;
		}
		
		numDays += day;
		
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		
		int dowIndex = numDays % 7;
//		System.out.println(dowIndex);
//		String[] days = new String[7];
//		days[0] = "Sunday";
//		days[1] = "Monday";
//		days[2] = "Tuesday";
//		days[3] = "Wednesday";
//		days[4] = "Thursday";
//		days[5] = "Friday";
//		days[6] = "Saturday";
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		return days[dowIndex];
	}

	public static void main(String[] args) {
		DOWFinder finder = new DOWFinder();
		String dow = finder.findDOW(5,10,2020);
		System.out.println(dow);

	}

}






