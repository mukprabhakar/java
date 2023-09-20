import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        int p,t;
        float r,SI;
        System.out.println("Enter the principle amount : ");
        p=Saamy.nextInt();
        System.out.println("Enter time period in years : ");
        t=Saamy.nextInt();
        System.out.println("Enter rate of interest per year (as a percentage) : ");
        r=Saamy.nextFloat();
        SI=(p*r*t)/100;
        System.out.println(SI);
    }
}
