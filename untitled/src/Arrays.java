import java.util.Scanner;

public class Arrays Min max average {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] userValues = new int[10];
        int i;

        for (i = 0; i < 10; ++i) {
            userValues[i] = scnr.nextInt();
        }

        int minVal = userValues[0];
        int maxVal = userValues[0];
        int sumVals = 0;

        for (i = 0; i < 10; ++i) {
            int currentVal = userValues[i];

            if (currentVal < minVal) {
                minVal = currentVal;
            }
            if (currentVal > maxVal) {
                maxVal = currentVal;
            }

            sumVals += currentVal;
        }

        double average = sumVals / 10.0;

        System.out.printf("%d %d %.1f\n", minVal, maxVal, average);
    }
}

