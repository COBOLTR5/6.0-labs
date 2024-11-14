import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];
        int count = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (value == -1) {
                break;
            }
            if (count >= 9) {
                System.out.println("Too many inputs");
                return;
            }
            userValues[count++] = value;
        }

        if (count % 2 == 1) {
            int middleIndex = count / 2;
            System.out.println(userValues[middleIndex]);
        } else {
            System.out.println("Too many inputs");
        }

        scanner.close();
    }
}
