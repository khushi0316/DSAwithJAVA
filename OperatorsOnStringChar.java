public class OperatorsOnStringChar {

    public static void main(String[] args) {
     String firstName="Khushi";
     String lastName="Rajpal"; 
    // String fullName =firstName+lastName; (output without space)
   // String fullName =firstName+" "+lastName; //( output eith space )
    // System.out.println(fullName);
            
                             // FOR CHAR NOW
    char ch = 'a';
    // char ch2 = 'b';
    char ch2 = (char)(ch+1);
    //System.out.println( ch+ch2); // (output is 195 boz a=sky value 97 and b=98)      
    System.out.println(ch2);                 
    }
}