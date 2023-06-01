import java.util.Scanner;
public class EmailContainsDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.print("Enter the number of test cases: ");
        int numCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numCases; i++){
            String email = scanner.nextLine();

            if (containsDigit(email)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }

    public static boolean containsDigit(String email) {
        for (char c : email.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

