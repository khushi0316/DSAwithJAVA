import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the coordinates of the rectangle's diagonal
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        // Calculate the area of the rectangle
        int area = (x2 - x1) * (y2 - y1);
        
        // Print the area
        System.out.println(area);
        
        scanner.close();
    }
}
