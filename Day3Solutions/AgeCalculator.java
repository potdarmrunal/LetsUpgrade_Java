import java.time.*;
import java.util.*;

public class AgeCalculator {  
   public static void main(String[] args)
    {
        // date of birth
        String name;
        int date,month,year,salery,annualSalery;
        Scanner sc = new Scanner(System.in);
        //employee name
        System.out.println("Enter Employee Name : ");
        name = sc.nextLine();
        //employee salery
        System.out.println("Enter salery : ");
        salery = sc.nextInt();
        annualSalery = salery * 12;
        // date of birth
        System.out.println("Enter date,month,year");
        date  = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        LocalDate pdate = LocalDate.of(year, month, date);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age Is :" + diff.getYears());
        System.out.println("Employee Annual Salery Is:" + annualSalery + " INR");
   }
}