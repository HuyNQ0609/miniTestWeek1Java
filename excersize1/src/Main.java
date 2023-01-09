import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Prime numbers less than " + n + " are: ");
        for (int i = 2; i < n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}