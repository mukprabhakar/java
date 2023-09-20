import java.util.Scanner;
public class floyid_number {
    public static void main(String[] args) {
        Scanner Saamy =new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=Saamy.nextInt();
        System.out.println("Enter the number of columns");
        int m=Saamy.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
