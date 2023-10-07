import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {8.0, 2.5, -1.5, 3.7, -2.2, 4.9, -3.8, 6.3, -5.1, 1.8, -4.6, 9.2, -7.4, 5.6, 0.9};

        double sumPositive = 0;
        int countPositive = 0;
        boolean negativeFound = false;

        for (double num : numbers) {
            if (num < 0) {
                negativeFound = true;
            } else if (negativeFound) {
                sumPositive += num;
                countPositive++;
            }
        }

        double averagePositive = sumPositive / countPositive;
        System.out.println(averagePositive);

        int[] arr = {-7,-4,-2,2,3,6,-8};

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
// Hi sensei
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}


