import java.util.Scanner;
public class odd_number_between_2_number {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.print("Enter starting point : ");
        int a = Saamy.nextInt();
        System.out.print("Enter the Ending point : ");
        int b= Saamy.nextInt();
        for(int i= a;i<=b;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
