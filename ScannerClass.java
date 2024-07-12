import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // float totalMarks=800f; 
        // int scored=540; // we should givethis input at runtime 
        float totalMarks = sc.nextFloat();
        int scored = sc.nextInt();
        // Calculate persentage of   all students
         double percentage = ((scored/totalMarks)*100 );
       
        System.out.println(percentage);    
    }
}
