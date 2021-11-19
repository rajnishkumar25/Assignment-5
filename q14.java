import java.util.Scanner ;

public class q14 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner (System.in);

        System.out.println(" Please enter a four digit number");

        int a= sc.nextInt();

        int b = a/1000 ;

        int e = a% 10;

        int d = (a/10)%10;

        int c = (a/100)-(10 *b);

        System.out.println( a +" " + b+ " " + c + " " + d + " "+ e );

        int f= e*1000+ d*100+c*10+b*1;

        System.out.println(" The opposite number is " +  f);


    }
    
}
