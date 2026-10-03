import java.util.Scanner;

public class table 
{
     public static void main(String[] agrs)
     {
      
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter a number = ");
          int a = sc.nextInt();

          for( int i = 1 ; i<=10 ; i++)
          {
              System.out.println(a + " X " + i + " = " + (a*i)); 
          }
   
          sc.close();

     }
}