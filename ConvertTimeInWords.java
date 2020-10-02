import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MyClass {

    public static void main(String[] args) {
        //This program will take numerical inputs for hour and minutes, after that
        //based on these values it will convert the numerical time to time in words.
        //Example: Sample input : 06:15 --> Sample output : quatrter past six
        String[] numberWords = new String[] {
				"",
				"one",
				"two",
				"three",
				"four",
				"five",
				"six",
				"seven",
				"eight",
				"nine",
				"ten",
				"eleven",
				"twelve",
				"thirteen",
				"fourteen",
				"fifteen",
				"sixteen",
				"seventeen",
				"eighteen",
				"nineteen",
				"twenty",
				"twenty one",
				"twenty two",
				"twenty three",
				"twenty four",
				"twenty five",
				"twenty six",
				"twenty seven",
				"twenty eight",
				"twenty nine"
		};
		
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		
		int nextHour = (hour % 12) + 1;
		
		if(minute == 0) {
			System.out.printf("%s o' clock\n", numberWords[hour]);
		}
		
		else if(minute == 15) {
			System.out.printf("quarter past %s\n", numberWords[hour]);
		}
		
		else if(minute == 30) {
			System.out.printf("half past %s\n", numberWords[hour]);
		}
		
		else if(minute == 45) {
			System.out.printf("quarter to %s\n", numberWords[nextHour]);
		}
		
		else if(minute < 30) {
			System.out.printf("%s minutes past %s\n", numberWords[minute], numberWords[hour]);
		}
		
		else {
			System.out.printf("%s minutes to %s\n", numberWords[60 - minute], numberWords[nextHour]);
		}
    }
}