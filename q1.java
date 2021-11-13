import java.util.Scanner ;

public class q1
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the two sides of the rectangle");
     double a= sc.nextDouble();
     double b= sc.nextDouble();

   if (a==b)

   {
       System.out.println(" The rectangle is actually a square ");
   }
    else 

    { 
        System.out.println(" The rectangle is not a square ");
    }


  
}
}
