import java.util.Scanner;

public class q2 

{

public static void main(String[] args)

 {
    
    Scanner sc = new Scanner (System.in);

    System.out.println(" Input the first value");

     int a = sc.nextInt();

    System.out.println( " Input the second value ");

     int b = sc.nextInt();

     if (a>b)

     {
         System.out.println(" A is greater than B ");
     }

     else 

    {
         if (b>a)
        {
            System.out.println(" B is greater than A ");
        }
    
        else 

        {

            System.out.println(" A and B are equal ");
        }
    
    
    }
 }

}
    

