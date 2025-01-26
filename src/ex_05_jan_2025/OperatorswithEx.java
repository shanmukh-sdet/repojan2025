package ex_05_jan_2025;

public class OperatorswithEx {
    public static void main(String[] args) {
        int a = 200;
        int d = 50;
        String s = "Shanmukh";
        char c = 'S';
        float f = 99.99f;
        boolean b = true;
        String Instance =new String("Srinivas");
        float addition = a+f;
        float substarction = a-f;
        float multiply = a*f;
        float divide = a/f;
        float remainder = a%f;
        boolean greater_operator = a>d;
        boolean less_operator = a<d;
        boolean equal_operator = a==d;
        boolean notEqual_operator = a!=d;

        System.out.println(addition);
        System.out.println(substarction);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);
        System.out.println(greater_operator);
        System.out.println(less_operator);
        System.out.println(equal_operator);
        System.out.println(notEqual_operator);
        System.out.println("Pre-increment:" +(++a) );
        System.out.println("Post-increment:"+(a++));
        System.out.println("pre-decrement:"+(--a));
        System.out.println("post-decrement"+(a--));
        System.out.println(Instance );
    }
}
