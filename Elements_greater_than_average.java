import java.util.Scanner;

public class CountElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        int average = sum / N;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] >= average) {
                count++;
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
