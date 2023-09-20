import java.util.Scanner;

public class compound_interest {
 // Java program to find compound interest for
// given values.
	public static void main(String args[]){
        Scanner Saamy = new Scanner(System.in);
        System.out.print("Enter principle amount : ");
		double principal = Saamy.nextDouble();
        System.out.print("Enter rate : ");
        double rate = Saamy.nextDouble();
        System.out.print("Enter time : ");
        double time =Saamy.nextDouble();
		/* Calculate compound interest */
		double CI = principal *(Math.pow((1 + rate / 100), time));
		
		System.out.println("Compound Interest is "+ CI);
	}
}

