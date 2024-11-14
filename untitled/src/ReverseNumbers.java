import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userList = new int[20];
        int numElements;

        numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            userList[i] = scanner.nextInt();
        }

        for (int i = numElements - 1; i >= 0; i--) {
            System.out.print(userList[i] + " ");
        }

        System.out.println();
    }
}
