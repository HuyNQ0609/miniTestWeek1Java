import java.util.Scanner;

public class excersize1 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        short n;
        System.out.println("Enter n: ");
        n = check.nextShort();
        short i = 2;
        while( i < n) {
            short j = 2;
            while( j < i) {
                if( i % j == 0) {
                    break;
                } else {
                    j++;
                }
            }
            if( j == i){
                System.out.println(i);
            }
            i++;
        }
    }
}