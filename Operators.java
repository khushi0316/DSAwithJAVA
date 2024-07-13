class Operators {
    public static void main(String[] args) {
        //Arithmetic operator (+,-,*,/,%)
        System.out.println(100+2);
        System.out.println(100-2);
        System.out.println(100*2);
        System.out.println(100/2);
        System.out.println(100%2);
        //Assignment Operator
        int i = 10;
        int j = i;
        int k = i = 100;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        //Augmented operators (+=,-=,*=./=)
        int num = 50;
        num += 10;
        System.out.println(num);
        //Precedence Operators
        System.out.println((8+7+6)/3);
    }
}
