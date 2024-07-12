import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three integer inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Calculate the sum of the integers
        int sum = a + b + c;

        // Calculate the average using integer division
        int average = sum / 3;

        // Display the result
        System.out.println(average);

        scanner.close(); 
        
        
    }
}
// Sample input 1:
// 1
// 2
// 3
// Sample output 1:
// 2
//  Explanation :
// We have a= 1,b= 2 and c =3  
// avg = (sum of elements ) / no of elements   
// avg = (1+2+3)/3 =  6/3 = 2 