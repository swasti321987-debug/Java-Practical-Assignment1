import java.util.Scanner;

public class voting
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter your age = ");
          int age = sc.nextInt();

          System.out.print("Are you a Indian citizen ? (true / false) = ");
          boolean citizen = sc.nextBoolean();

          if(age >= 18 && citizen == true)
          {
               System.out.println("You are eligible to vote. ");
          }

          else
          {
               if(age<18)
               {
                     System.out.println("You are not eligible to vote because your age is less then 18. ");
               }
               else
               {
                   System.out.println("You are not eligible to vote because you are not Indian citizen ");
               }
          }

          sc.close();
    }
}