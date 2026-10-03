import java.util.Scanner;

public class grade
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

         int total = 0;
         int[] marks = new int[5];

         for( int i = 0 ; i < 5 ; i++)
         {
              System.out.print("Enter Marks of Subject " + (i + 1) + " = ");
              marks[i] = sc.nextInt();

              total = total + marks[i];
         }

         double avg = total / 5.0;

         char grade;

         if(avg >= 90)
         {
              grade = 'A';
         }

         else if(avg >=75)
         {
              grade = 'B';
         }

         else if(avg >= 50)
         {
              grade = 'C';
         }

         else
         {
              grade = 'F';
         }

         System.out.println("\nTotal Marks = " + total);
         System.out.println("Average Marks = " + avg);
         System.out.println("Grade = " + grade);

         sc.close();
    }
}
         