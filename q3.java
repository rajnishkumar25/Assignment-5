import java.util.Scanner ;

public class q3
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the quantity you are willing to purchase");
     double a= sc.nextDouble();
    // double b= sc.nextDouble();

   if (a >1000)

   {
       System.out.println(" The total price is "+ (100*a*0.9));
   }
    else 

    { 
        System.out.println(" The total price is "+ 100*a );
    }


  
}
}