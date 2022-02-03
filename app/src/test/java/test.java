public class test {
    boolean truthy; // true or false

    byte eightbits; // -128...127
    short sixteenbits; // -32_768 .. 32_32_767
    int thirtytwobits;
    long sixtyfourbits;
    char sinxteenUnassignedbits; //0...65_535

    float f32; // IEEE 764 single precsiosn float 23 bits of mantessa and 8 bits of exponent
               // 1.mmmmmmmmmm's x 2^(eeeee's-128) - about 7 decimal digits of precision
                // 30 exponents
    double d64; // IEEE 754 doulble 53 bits of mantessa and 10 bits of exponent
                // 2.mmmmmmmmmmmmmmmm x 2^(eeeeee's-512)
                // about 15 digits of precision 10^300

    double root(double x){
        return (x >= 0.0) ? Math.sqrt(x) : 0.0;
    }

    void logic(){
        boolean p = true, q = false;
        boolean pANDq = p && q;
        boolean pORq = p || q;
        boolean notP = !p;
        boolean pEQUALSq = (p == q);

       // if (x != 0.0 && 1/x > 3)

    }

}
