import java.util.Scanner ;

public class q5

{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);


        System.out.println(" What is the marks you have scored ?");

        int a= sc.nextInt();

        int marks;

        switch(a)

        {
            case 25:
            System.out.println(" You got a F grade ");
            break;

            case 45:
            System.out.println(" You got a E grade ");
            break;

            case 50:
            System.out.println(" You got a D grade ");
            break;

            case 60:
            System.out.println(" You got a C grade ");
            break;

            default :
            System.out.println(" dont know what grade you got ");
        }

        
    }
}
