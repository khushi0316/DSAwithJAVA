public class CalculatePercentage {
  public static void main(String[] args) {
   // int totalMarks=800;
    float totalMarks=800; // for correct ans we use flout and double in one of them in percentage
    int scored=540;
    // calculate the percentage //(score/total*100)
    double percentage = ((scored/totalMarks)*100 );
    // System.out.println((scored/totalMarks)*100);
    System.out.println(percentage); // (output will be 0.0 booz the int is only taking 0 from 0.67 so 0 *100 and in double it will be 0.0)
  }  
} 
 