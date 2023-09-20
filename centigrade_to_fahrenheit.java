import java.util.Scanner;

public class centigrade_to_fahrenheit {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.println("Enter the temperature in centigrade : ");
        double celsius = Saamy.nextDouble();
       // double celsius = Double.parseDouble(Saamy.nextLine());
        //double fahrenheit = (celsius * 1.8)+32
        double fahrenheit=9*celsius/5+32;
        System.out.println(fahrenheit);
    }
}
