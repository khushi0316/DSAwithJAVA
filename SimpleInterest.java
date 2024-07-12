import java.util.Scanner;

public class SimpleInterest  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the principal amount
        int principal = scanner.nextInt();

        // Read the rate of interest
        double rate = scanner.nextDouble();

        // Read the time period
        int time = scanner.nextInt();

        // Calculate the simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result as an integer
        System.out.println((int) simpleInterest);

        scanner.close();
    }
}

// Sample Input 1:
// 2000
// 2.2
// 4
// Sample Output 1:
// 176
// Explanation:
// principal=2000,rate=2.2 and time=4.
// Simple interest = (Principal*rate*time) /100
// Hence answer is (2000*2.2*4)/100 = 176

