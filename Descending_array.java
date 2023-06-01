import java.util.*;
public class decendingarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, temp = 0;
        ;
        int a[] = new int[n];
        int b[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            b[i] = a[i];
        }
        for (i = 1; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        int c = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                c = 0;
            } else {
                c = 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
