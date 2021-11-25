public class ThreeWorkspaceOne{

    public static void main(String[] args){

        int numberInt;      // 32 bits
        short numberShort;  // 16 bits
        long numberLong;    // 64 bits
        byte numberByte;    // 8 bits

        numberByte = (byte) 2000;   //Since Precision loss might occur, Java langage mandates a (byte) cast for conversion - error thrown otherwise

        System.out.println(numberByte);


        numberLong = 1000L;
        numberShort = 8_000;            // Java compiler simply ignores the '_' in the source code
                                        // '_' meant only for human eyes and ease of understanding number magnitude (or scale? don't know)

        numberInt = 0B1001;             // Prefix 0B denotes the remaining digits as binary digits -> numberInt = 0 is the equivalent expression
        numberByte = 0x10;              // Prefix 0x denotes the remaining digits as hexadecimal digits -> numberByte = 7 is the equivalent expression

        System.out.println(numberShort);// Prints 8000
        System.out.println(numberInt);  // Prints 9
        System.out.println(numberByte); // Prints 16

        //Floating point types
        double valueOne;
        double valueTwo;
        double resultOne;
        double resultTwo;
        double resultThree;
        double resultFour;

        System.out.println("\n\n\tSHOWCASE SPECIAL DOUBLE VALUES THAT DENOTE OVERFLOW OR AN ERROR");
        System.out.println("========================================================================================");
        // Showcase Positive Infinity double special value
        valueOne = 1.0;
        valueTwo = 0;
        resultOne = valueOne / valueTwo;
        System.out.println("1.0 / 0-> Positive Infinity = " + resultOne);

        // Showcase Negative Infinity double special value
        valueOne = -1.0;
        valueTwo = 0;   //stays the same
        resultTwo = valueOne / valueTwo;
        System.out.println("-1.0 / 0 -> Negative Infinity = " + resultTwo);

        // Showcase Not a Number aka "NaN" double special value
        valueOne = 0;
        valueTwo = 0;
        resultThree = valueOne / valueTwo;
        System.out.println("0 / 0 -> Not a Number = " + resultThree);

        // Showcase Not a Number aka "NaN" double special value
        valueOne = -1.0;
        resultFour = Math.sqrt(valueOne);   //square root of negative number
        System.out.println("Square root of -1.0 -> Not a Number = " + resultThree);

        System.out.println("========================================================================================");

        // Escape Sequences
        // The \ u escape sequence can be used OUTSIDE character litearls and strings in the actual code. Example:
        //  \ u005B = '['
        //  \ u005D = ']'

        int\u005B\u005D listOfValues = new int\u005B10\u005D;   //creates array of size 10;
        listOfValues\u005B0\u005D = 1;

        System.out.println("" + listOfValues[0] + '\n');

        // Character class has methods to check if characters are valid characters to use in variable names
        System.out.println(Character.isJavaIdentifierStart('a'));   // True
        System.out.println(Character.isJavaIdentifierStart('&'));   // False
        System.out.println(Character.isJavaIdentifierPart('a'));    // True
        System.out.println(Character.isJavaIdentifierPart('*'));    // False
    }

}