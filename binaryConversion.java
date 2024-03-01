import java.util.Scanner;

public class binaryConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int conversion[] = new int[17];

        int i = 0;

        System.out.println("Enter a number:");

        int userInput = input.nextInt();

        while (userInput < 0 || userInput > 65536) {
            System.out.println("Invalid Number");
            System.out.println("Enter a number:");
            userInput = input.nextInt();
        }

        System.out.println("What base value do you want to convert to?: ");

        int baseInput = input.nextInt();

        while (baseInput < 2 || baseInput > 16) {
            System.out.println("Invalid Base. Please enter a base between 2 and 16.");
            System.out.println("What base value do you want to convert to?: ");
            baseInput = input.nextInt();
        }

        while (userInput > 0) {
            int remainder = userInput % baseInput;
            conversion[i] = remainder;
            userInput = userInput / baseInput;
            i++;
        }

        if (i == 0) {
            conversion[i] = 0;
            i++;
        }

        System.out.print("Binary Conversion: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(conversion[j]);
        }
    }
}