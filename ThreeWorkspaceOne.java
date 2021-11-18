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
        numberByte = 0x10;              // Prefix 0x denotes the remaining digits as binary digits -> numberByte = 7 is the equivalent expression

        System.out.println(numberShort);// Prints 8000
        System.out.println(numberInt);  // Prints 9
        System.out.println(numberByte); // Prints 16
    }

}