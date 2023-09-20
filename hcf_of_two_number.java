import java.util.Scanner;
public class hcf_of_two_number {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.print("Enter first  number: ");
        int a =Saamy.nextInt();
        System.out.print("Enter second number: ");
        int b=Saamy.nextInt();
        int hcf=0;
        for(int i=1;(i<=a) && (i<=b);i++){
            if((a%i ==0) && (b%i == 0)){
            hcf = i;
            }
        }
        System.out.print("hcf of "+a+" and "+b+" is : "+hcf);

    }
}


