import java.util.Scanner;
public class trigonometric {
        public static void main(String[] args) {
            Scanner Saamy = new Scanner(System.in);
            System.out.print("Enter angle in degree : ");
            double angle = Saamy.nextDouble(); // Angle in degrees
    
            double radians = Math.toRadians(angle); // Convert degrees to radians
    
            System.out.println("Trigonometric function values for angle " + angle + " degrees:");
    
            System.out.println("Sine: " + Math.sin(radians));
            System.out.println("Cosine: " + Math.cos(radians));
            System.out.println("Tangent: " + Math.tan(radians));
    
            System.out.println("Cosecant: " + (1 / Math.sin(radians)));
            System.out.println("Secant: " + (1 / Math.cos(radians)));
            System.out.println("Cotangent: " + (1 / Math.tan(radians)));
        }
    }
    

