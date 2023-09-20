import java.util.Scanner;

public class area_and_perimeter_of_square {
    public static void main(String[] args) {
        Scanner Saamy =new Scanner(System.in);
        System.out.println("Enter the length of side : ");
        int l=Saamy.nextInt();
        double p=(l*4);
        double a=l*l;
        System.out.println("the perimeter of square : "+p+"  and area of square : "+a);
    }
}
