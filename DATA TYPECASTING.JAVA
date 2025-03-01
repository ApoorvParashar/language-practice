public class TypeCastingDemo {
    public static void main(String[] args) {
        
        // ✅ IMPLICIT TYPE CASTING (WIDENING)
        int numInt = 100;
        double numDouble = numInt; // Automatically converts int to double
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + numInt);
        System.out.println("Converted to double: " + numDouble);
        
        // ✅ EXPLICIT TYPE CASTING (NARROWING)
        double pi = 3.14159;
        int intPi = (int) pi; // Manually casting double to int (fractional part lost)
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + pi);
        System.out.println("Converted to int: " + intPi);
        
        // ✅ CHAR TO INT CASTING
        char letter = 'A';
        int ascii = (int) letter; // Explicitly converting char to int (ASCII value)
        System.out.println("\nChar to Int Casting:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + ascii);

        // ✅ INT TO BYTE CASTING (DATA LOSS)
        int bigNumber = 130;
        byte smallByte = (byte) bigNumber; // Data loss because byte range is -128 to 127
        System.out.println("\nInt to Byte Casting:");
        System.out.println("Original int: " + bigNumber);
        System.out.println("Converted to byte: " + smallByte); // Data los
