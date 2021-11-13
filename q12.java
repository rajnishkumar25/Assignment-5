import java.util.Scanner ;

public class q12
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the year you want to check");
     float a= sc.nextFloat();

    //  System.out.println("Enter the number of classes attended by you");
    //  float b= sc.nextFloat();

    //  System.out.println("The percentage of classes attended by you is"+ b/a*100 + "%");
    float b=a%100;
    float c=a%400;
    float d=a%4;

   if (b==0)

   {
       if (c==0)

       {
           System.out.println( " This year is divisible by 400 , hence is a leap year ");
        }

        else

        { 
            System.out.println( " This year is divisible by 100 but not by 400 , hence is not a leap year ");
        }
   }
    else 

    { 

        if (d==0)

        {
        System.out.println(" This year is divisible by 4 0r 400 , and not by 100  , hence is a leap year " );

        }

        else 

        {

            System.out.println(" This year is not divisible by 4 , hence is not a leap year " );
        }
    }


  
}
}
