import java.util.Scanner;

public class MultipyTwoNumbers{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read two integers from input
        long F1 = scanner.nextLong();
        long F2 = scanner.nextLong();
        
        // Calculate the product
        long product = F1 * F2;
        
        // Print the product
        System.out.println(product);
        
        scanner.close();
    }
}


// Sample Input 1:
// 123456789  123456789
// Sample Output 1:
// 15241578750190521
// Sample Input 2:
// 123456 123456
// Sample Output 2:
// 15241383936
