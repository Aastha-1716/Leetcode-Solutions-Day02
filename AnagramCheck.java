import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s = sc.nextLine();

        System.out.print("Enter the second string: ");
        String t = sc.nextLine();

        boolean result = isAnagram(s, t);

        System.out.println("Is Anagram: " + result);

        sc.close();
    }
}