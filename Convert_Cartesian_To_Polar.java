import java.util.Scanner;

public class Convert_Cartesian_To_Polar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cartesian co-ordinates (x, y): ");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        scanner.close();

        float r = (float) Math.sqrt(x * x + y * y);
        float theta = (float) Math.atan2(y, x);

        System.out.println("Polar co-ordinates (r, θ): ");
        System.out.println("r = " + r);
        System.out.println("θ = " + theta);
    }
}
