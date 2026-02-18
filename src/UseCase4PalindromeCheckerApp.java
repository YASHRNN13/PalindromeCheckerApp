import java.util.Scanner;

class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}
