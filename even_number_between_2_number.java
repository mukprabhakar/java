import java.util.Scanner;

public class even_number_between_2_number {
    public static void main(String[] args){
        Scanner Saamy = new Scanner(System.in);
        System.out.println("Enter the starting point :");
        int a = Saamy.nextInt();
        System.out.println("Enter the ending point : ");
        int b = Saamy.nextInt();
        for(int i =a;i<=b;i++){
            if(i%2==0){
                System.out.print(i +" ");
            }
        }

    }
}
