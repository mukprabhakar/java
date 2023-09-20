import java.util.Scanner;

public class sum_of_two_number {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        int a,b ,sum;
        System.out.println("Enter first number :  ");
        a=Saamy.nextInt();
        System.out.println("Enter second number : ");
        b=Saamy.nextInt();
        sum = a + b;
        System.out.println(sum);
    }
}
