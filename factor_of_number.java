import java.util.Scanner;
public class factor_of_number {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num =Saamy.nextInt();
        for(int i =1; i<=num;i++){
            if(num % i==0){
                System.out.print(i+"  ");
            }
        }
    }
}
