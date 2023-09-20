import java.util.Scanner;

public class swap_2_number_without_using_3_variable {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number : ");
        a = Saamy.nextInt();
        System.out.println(" Enter the second number : ");
        b=Saamy.nextInt();
        System.out.println("Before swapping a =" +a+ " b = "+b);
        a = a+b ;
        b = a-b ;
        a = a  - b;
        System.out.println("After swapping a = "+a+ " b= "+b);
    }
}
