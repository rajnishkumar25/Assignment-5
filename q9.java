import java.util.Scanner ;

public class q9
{

public static void main(String[] args) 

{
     Scanner sc = new Scanner (System.in);

     System.out.println("Enter the number of classes held");
     float a= sc.nextFloat();

     System.out.println("Enter the number of classes attended by you");
     float b= sc.nextFloat();

     System.out.println("Do you have a medical cause");
     boolean c=sc.nextBoolean();

     float d=b/a;

     System.out.println("The percentage of classes attended by you is"+ b/a*100 + "%");

   if (d<0.75  && c!=true)

   {
       System.out.println(" You are not entiltled to attend the exam since your attendance is less than 75%");
   }
    else if (d<0.75  && c!=false)

    { System.out.println(" You are not entiltled but we are allowing due to medical reasons");}

    else

    { 
        System.out.println(" You are allowed to give the exam " );
    }


  
}
}
