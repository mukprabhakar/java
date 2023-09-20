import java.util.Scanner;

public class ascii_value {
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=Saamy.next().charAt(0);
        int code=ch;
        System.out.println(code);
        
    }
}
