import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();

        for (int num : numbers) {
            if (num >= lowerBound && num <= upperBound) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }
}