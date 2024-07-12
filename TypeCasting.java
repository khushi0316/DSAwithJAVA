public class TypeCasting {
    public static void main(String[] args) {
                                // ques is Find the birthyear of person and and the year he/she was born ?? 
        //short currentYear=2030 ;
        //byte age = 39 ; 

        //short birthyear=currentYear-age ;
        //System.err.println(birthyear);
        //{ Abovw code can't work boz of use short data type }
        //int currentYear=2030 ;
        //float age = 39f ; 

        //float birthyear=currentYear-age ;
        //System.err.println(birthyear);
        // { THIS WAS THE IMPLICIT TYPE CASING  - In which the java convert data type automatically}


        // { NOW THE EXPLICIT TC- Un wich we tell java to change dataype ecplicitly into the smaller one }

       // short currentYear=2030 ;
       // int age = 39 ; 

       // short birthyear=(short)(currentYear-age) ;
       //  int year = (int) currentYear;
        // System.err.println(year);
                                // {ASSIGNMENT QUES}
                               // int num = 10;
                                //double result = (double) num / 4;
                                // System.out.println(num);

                                //{ASSIGNMENT QUES2}
                                //int my_Int = 9;
                               // double my_Double = my_Int;

                                // Print the values
                                //System.out.println("The value of myInt: " + my_Int);
                                //System.out.println("The value of myDouble: " + my_Double);
                               // {ASSIGNMENT QUES3}
                               double doubleValue = 9.85; 
                               int result=(int) doubleValue ;
                               System.out.println(result);

    }
}