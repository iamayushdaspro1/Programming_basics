import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    //This function will convert AM or PM based time to a 24 hour based time
    //Sample input 06:09:34PM --> Sample output 18:09:34
    static String timeConversion(String s) {
        String unit = Character.toString(s.charAt(s.length()-2))+
        Character.toString(s.charAt(s.length()-1));
        int len = s.length();
        s = s.replace("AM", "");
        s = s.replace("PM", "");
        int hour = Integer.parseInt(Character.toString(s.charAt(0))+
        Character.toString(s.charAt(1)));
      
        if(unit.equals("AM") && hour==12)
        {
            hour = hour-12;
        }
        else if(unit.equals("PM") && hour != 12)
            hour = hour+12;


        StringBuilder result = new StringBuilder(s);
        result.setCharAt(0, (char)((hour/10)+'0'));
        result.setCharAt(1, (char)((hour%10)+'0'));

          //System.out.print("Unit "+unit+" Hour "+hour+ " Result "+(char)(hour%10));
        return result.toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
    }
}
