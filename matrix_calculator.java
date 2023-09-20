import java.util.Scanner;
public class matrix_calculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner Saamy = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("*************** Welcome to matrix Calculator******************");
        System.out.println("--------------------------------------------------------------");
        System.out.println(" choose the Operation would you like to perform :              ");
        System.out.println("1) Addition = '+'                         2) substraction = '-'");
        System.out.println("3) Multiplication = '*'                      4) Transpose = 'a'");
        System.out.println("5) Determinent = 'b'                           6) Inverse = 'c'");
        System.out.println("7) Rank = 'd'                 8) Trival and Non - Trivial = 'e'");
        System.out.println("9) Cayley Hamilton = 'f'      10) Eigen Values and Vector = 'g'");
        System.out.println("---------------------------------------------------------------");
        System.out.print("Enter number of Rows : ");
        int r = Saamy.nextInt();
        System.out.print("Enter number of Column : ");
        int c = Saamy.nextInt();
        int i,j,k,arr1[][],brr1[][],crr1[][],mul[][],det =0,determinant =0,rank;
        System.out.print("Enter Operation Symbol given above : ");
        char opt = Saamy.next().charAt(0);
        if( opt=='+' || opt == '-' || opt == '*'){
            System.out.println("Input elements in the first matrix : ");
            for(i=0;i<c;i++){
                for(j=0;j<r;j++){
                    // System.out.print("Element - " + arr1[i][j]);
                }
            }
        }
    }
}
