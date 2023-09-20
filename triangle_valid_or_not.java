import java.util.Scanner;

public class triangle_valid_or_not {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.print("Enter first side of triangle : ");
        int a= Saamy.nextInt();
        System.out.print("Enter first side of triangle : ");
        int b= Saamy.nextInt();
        System.out.print("Enter first side of triangle : ");
        int c= Saamy.nextInt();
        if(((a+b)>c) && ((b+c)>a) && ((a+c)>b)){
            System.out.print("Tringle is valid");
        } else{
            System.out.print("Tringle is invalid");
        }
    }
}
