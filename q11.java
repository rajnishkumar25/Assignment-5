import java.util.Scanner ;

public class q11 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);
        char a;

        System.out.println(" Enter the character "); 
        a= sc.next().charAt(0);
        int b =(int)a ;

        System.out.println( b);

        if (b>64 && b<91)

        { System.out.println(" The character is bigger alphabet");}

        else if ((b>95 && b<123))

        {System.out.println(" The character is smaller alphabet");}

        else 

        {System.out.println(" The charcater is not an alphabet"); }
    }
    
}
