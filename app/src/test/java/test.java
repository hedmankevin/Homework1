public class test {
    //8 primitives
    boolean truthy = true; // true or false
    //Boolean b; wrapper type

    byte eightbits = 100; // -128...127
    byte b2 = -0x80;
    byte b3 = 0b0110_1010;
    byte b4 = ((byte) 255);  //0000 0000 0000 0000 0000 0000 1111 1111
    //Byte

    short sixteenbits; // -32_768 .. 32_32_767
    //Short
    int thirtytwobits;
    //Integer
    long sixtyfourbits;
    //Long
    char sinxteenUnassignedbits; //0...65_535
    //Character
    float f32; // IEEE 764 single precsiosn float 23 bits of mantessa and 8 bits of exponent
               // 1.mmmmmmmmmm's x 2^(eeeee's-128) - about 7 decimal digits of precision
                // 30 exponents
    //Float
    //234.1234567 = 0.2341234567 * 10^3  only 0.2341234 is kept

    double d64; // IEEE 754 doulble 53 bits of mantessa and 10 bits of exponent
                // 2.mmmmmmmmmmmmmmmm x 2^(eeeeee's-512)
                // about 15 digits of precision 10^300
    //double
    double root(double x){
        return (x >= 0.0) ? Math.sqrt(x) : 0.0;
    }

    void logic(){
        boolean p = true, q = false;
        boolean pANDq = p && q;
        boolean pORq = p || q;
        boolean notP = !p;
        boolean pEQUALSq = (p == q);

        //boolean inOrderWrong = (3 <= 5 <= 7);  // (3 <= 5) <= 7), ((true) <= 7)
        boolean inOrderRight = (3 <= 5) && (5 <= 7);


        Object x = null;

       // if (x != 0.0 && 1/x > 3)

    }

}
