public class even_sum
{
     public static void main(String[] args)
     {
         int n =  1;
         int sum = 0;

         while(n<=50)
         {
             if(n % 2 == 0)
             {
                 sum = sum + n;
             }

             n++;
         }

         System.out.println("Sum of the even number from 1 to 50 = " + sum);
     }
}