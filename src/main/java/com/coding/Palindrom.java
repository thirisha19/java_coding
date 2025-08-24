import java.util.*;

public class Palindrom {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int p = 0;
        while (temp > 0) {
            int digit = temp % 10;
            p = (p * 10) + digit;
            temp /= 10;
        }
        return x == p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}