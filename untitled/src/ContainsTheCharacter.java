import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        char targetChar = scanner.next().charAt(0);

        for (String word : words) {
            if (word.indexOf(targetChar) != -1) {
                System.out.println(word);
            }
        }
    }
}
