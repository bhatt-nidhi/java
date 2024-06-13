import java.util.Scanner;

class AmicableNumbers {
    private int num1;
    private int num2;

    public AmicableNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    private int sumOfDivisors(int num) {
        int divisorSum = 1; // Start with 1 because all numbers are divisible by 1
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }

    // public boolean checkAmicable() {
    //     int sum1 = sumOfDivisors(num1);
    //     int sum2 = sumOfDivisors(num2);
    //     return sum1 == num2 && sum2 == num1;
    // }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        AmicableNumbers amicableNumbers = new AmicableNumbers(num1, num2);

        if (amicableNumbers.checkAmicable()) {
            System.out.println(num1 + " and " + num2 + " are Amicable Numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not Amicable Numbers.");
        }

        scanner.close();
    }
}
