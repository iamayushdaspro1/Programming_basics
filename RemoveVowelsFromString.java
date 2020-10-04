import java.util.Scanner;
 
public class RemoveVowelsFromString
{
   public static void main(String args[])
   {
       String s1, s2;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       s1 = scan.nextLine();
       
       s2 = s1.replaceAll("[aeiouAEIOU]", "");
	   
       System.out.print("All Vowels Removed Successfully..!!");
              
       System.out.print(s2);
   }
}