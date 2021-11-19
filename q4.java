import java.util.Scanner;

public class q4

{

 public static void main(String[] args) {
     
    {

        Scanner sc = new Scanner (System.in);

        System.out.println( " How much is your annual salary ?");

        double a=sc.nextDouble();

        System.out.println( " Which year did you join the organisation ?");

        int b=sc.nextInt();
        int c=2021;
        int d =c - b;
        double e = 0.05 * a;

        if (d>=5)
        { 
            System.out.println(" Congratulations you are entiltled to a bonus of 5% of your salary");

            System.out.println(" You would be given a bonus of" +"      " + e );
        }
    }
 }
}
