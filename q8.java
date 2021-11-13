import java.util.Scanner ;

public class q8
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the number of classes held");
     float a= sc.nextFloat();

     System.out.println("Enter the number of classes attended by you");
     float b= sc.nextFloat();

     System.out.println("The percentage of classes attended by you is"+ b/a*100 + "%");

   if (b/a < 0.75)

   {
       System.out.println(" You are not entiltled to attend the exam since your attendance is less than 75%");
   }
    else 

    { 
        System.out.println(" You are allowed to give the exam " );
    }


  
}
}
