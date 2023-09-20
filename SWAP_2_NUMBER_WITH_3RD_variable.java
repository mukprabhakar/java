//package java programming;
import java.util.Scanner;

public class SWAP_2_NUMBER_WITH_3RD_variable {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        int a,b,temp;
        System.out.println(" enter the value of a : ");
        a =  Saamy.nextInt();
        System.out.println("enter the value of b : ");
        b =  Saamy.nextInt();
        System.out.println("before swapping a = "+a+" b= "+b);
        temp = a;
        a= b;
        b = temp;
        System.out.println("after swapping a = "+a+" b ="+b);


    }
}

