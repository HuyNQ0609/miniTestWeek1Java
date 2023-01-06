public class excersize2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] arr = {15, 23, 55, 76, 82, 45, 66, 87, 91, 59};
        int sum = 0;
        int max = arr[0];
        for (int j : arr) {
            sum = sum + j;
            if( max < j) {
                max = j;
            }
        }
        System.out.println("Total: " + sum);
        System.out.println("Max: " + max);
    }
}