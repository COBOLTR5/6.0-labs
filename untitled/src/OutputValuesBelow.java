import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[20];
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            userValues[i] = scanner.nextInt();
        }

        int threshold = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (userValues[i] <= threshold) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
