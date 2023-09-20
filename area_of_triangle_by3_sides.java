import java.util.Scanner;

public class area_of_triangle_by3_sides {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first side of triangle: ");
        int a = scanner.nextInt();
        System.out.print("Enter second side of triangle: ");
        int b = scanner.nextInt();
        System.out.print("Enter third side of triangle: ");
        int c = scanner.nextInt();
        scanner.close();

        double s = (a + b + c) / 2.0;
        double r = s * (s - a) * (s - b) * (s - c);
        double area = Math.sqrt(r);

        System.out.println("Area of the triangle: " + area);
    }
}
