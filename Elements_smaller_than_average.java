import java.util.Scanner;

public class CountElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // Create an array of given length
        int[] arr = new int[N];

        // Read the array elements
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate the average value
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        int average = sum / N;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] <= average) {
                count++;
            }
        }
        System.out.println(count);

        scanner.close();
    }
}