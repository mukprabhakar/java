import java.util.Scanner;

public class avarage_of_3numbers {
    public static void main(String[] args) {
          Scanner Saamy = new Scanner(System.in);
        System.out.println("enter first number : ");
        int a=Saamy.nextInt();
        System.out.println("Enter second number : ");
        int b=Saamy.nextInt();
        System.out.println("enter third number: ");
        int c=Saamy.nextInt();
        double avarage=(a+b+c)/3;
        System.out.println(avarage);
    }
}
