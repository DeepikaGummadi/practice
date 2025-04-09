import java.util.Scanner;

 class Some{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();
        int reversedNumber = 0, remainder, temp = originalNumber;

        while (temp != 0) {
            remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome!");
        } else {
            System.out.println(originalNumber + " is not a Palindrome.");
        }

        scanner.close();
    }
}

