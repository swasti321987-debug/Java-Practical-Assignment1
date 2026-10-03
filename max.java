import java.util.Scanner;

public class max
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);

         int[] n = new int[10];

         for(int i = 0 ; i < 10 ; i++)
         {
              System.out.print("Enter a number for " + (i + 1) + " position in array = ");
              n[i] = sc.nextInt();
         }

         int max = n[0];

         for(int i = 1 ; i < 10 ; i++)
         {
              if(n[i] > max)
              {
                   max = n[i];
              }
         }

         System.out.println("Maximum Value within the array = " + max);

         sc.close();
    }
}     