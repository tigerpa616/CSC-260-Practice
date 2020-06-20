import java.util.*;

public class Test
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter Month (1-12): ");
       int month = scan.nextInt();
       Date.checkMonth(month);

       String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

       System.out.print("Enter Day of said Month: ");
       int day = scan.nextInt();
       Date.checkDay(day);

       System.out.print("Enter Year: ");
       int year = scan.nextInt();

       System.out.println("MM/DD/YYYY:" + " " + month + "/" + day + "/" + year);
       System.out.println("Month DD, YYYY:" + " " + months[month-1] + " " + day + ", " + year);


   }
}
