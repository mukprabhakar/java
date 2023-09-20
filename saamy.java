import java.util.Scanner;

public class saamy {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=Saamy.nextInt();
        if (num>0){
            System.out.println(num+" is a positive number");
        }else{
            System.out.println(num+" is a negative number ");
        }
    }
}


