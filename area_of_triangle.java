import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
     Scanner Saamy = new Scanner(System.in);
     System.out.println("Enter the height of triangle : ");
     int h = Saamy.nextInt();
    System.out.println(" Enter the base of the triangle : ");
    int b=Saamy.nextInt();
    int area=(int)(0.5*h*b) ;
    System.out.println(area);  
    }
}
