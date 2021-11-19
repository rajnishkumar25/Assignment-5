import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println(" Enter the age of the first person");

        int a= sc.nextInt();

        System.out.println(" Enter the age of the second person");

        int b= sc.nextInt();

        System.out.println(" Enter the age of the third  person");

        int c= sc.nextInt();

        if (a<b && b<c)

        {System.out.println(" third person is oldest and first is youngest ");}

        else if (b<a && a<c)

        {System.out.println(" third person is oldest and second is youngest ");}

        else 

        {System.out.println(" second person is oldest and first is youngest ");}
    }
    
}
