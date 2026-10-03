import java.util.Scanner;

public class array
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);

          int[] marks = new int[5];

          for(int i = 0 ; i < 5 ; i++ )
          {
               System.out.print("Enter marks of Student no. " + (i + 1) + " = ");
               marks[i] = sc.nextInt();
          }
          System.out.println("\nStudents marks = ");

          for(int i = 0 ; i < 5 ; i++)
          {
              System.out.println("Marks of Student no. " + (i + 1) + " = " + marks[i]);
          }

          sc.close();
    }
}