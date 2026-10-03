import java.util.Scanner;

public class calculator
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter first number = ");
          int a = sc.nextInt();

          System.out.print("Enter second number = ");
          int b = sc.nextInt();

          System.out.print("Enter Operator (+ , - , * , / ) = ");
          char operator = sc.next().charAt(0);

          if(operator == '+')
          {
               System.out.println(a + " + " + b + " = " + (a + b));
          }

          else if(operator == '-')
          {
               System.out.println(a + " - " + b + " = " + (a - b));
          }

          else if(operator == '*')
          {
               System.out.println(a + " * " + b + " = " + (a * b));
          }

          else if(operator == '/')
          {
               if(b != 0)
               {
                     System.out.println(a + " / " + b + " = " + (a / b));
               }
          
               else
               {
                     System.out.println("Cannot divide by zero. ");
               } 
          }

          else
          {
                System.out.println("Invalid operator. ");

          }
          
          sc.close();
      }
}   