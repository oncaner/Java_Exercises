import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("\n");

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (numbers[i] == 0) {
                        continue;
                    }
                    System.out.println("Repeated Number: " + numbers[i]);
                    count++;
                }

                if (count > 0) {
                    numbers[i] = 0;
                    numbers[j] = 0;

                    count = 0;
                }
            }
        }

        System.out.println("\nRepeated numbers have been removed successfuly.\n");

        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
        System.out.print("\n");

    }
}

