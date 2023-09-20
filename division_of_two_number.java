import java.util.Scanner;

public class division_of_two_number {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        int a,b,division;
        System.out.println("Enter first number : ");
        a= Saamy.nextInt();
        System.out.println("Enter second number : ");
        b= Saamy.nextInt();
        division = a/b;
        System.out.println(division);
    }
}
