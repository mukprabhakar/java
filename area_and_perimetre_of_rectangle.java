import java.util.Scanner;

public class area_and_perimetre_of_rectangle {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int l= Saamy.nextInt();
        System.out.println("Enter the breadth : ");
        int b=Saamy.nextInt();
        double a,p;
        p=(l+b)*2;
        a=l*b;
        System.out.println("the perimerter of rectangle : "+p+   "  and area of rectangle : "+a);
    }
}
