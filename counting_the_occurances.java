import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str = scanner.nextLine();
        char ch = scanner.nextLine().charAt(0);
        int count = countCharacter(Str, ch);
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }

    public static int countCharacter(String Str, char ch) {
        int count = 0;
        for (int i = 0; i <Str.length(); i++) {
            if (Str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}