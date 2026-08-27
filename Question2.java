public class Question2 {
    public static void main(String[] args) {

        byte b = 100;
        short s = 20000;
        int i = 350000; 
        long l = 9000000000L;          //needs the L suffix: exceeds int range
        float f = 3.14f;               //needs the f suffix: double is the default
        double d = 3.14159265;
        char c = 'J';
        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

    }
    
}
