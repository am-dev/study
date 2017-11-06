package testing;

public class countsBits {

    public static short countBits(int x){
        short numBits = 0;
        while(x != 0){
            //& = bitwise and,
            numBits += (x & 1); //+=, adds right operand to the left and assigns result to left
            x >>>= 1;
        }
        return numBits;
        /*
            Explained ...

            int = 13
            loop 1 : x = 1101
                1101 & 0001 = 0001
                x >>>= 0110
            loop 2 : x = 0110
                0110 & 0001 = 0000
                x >>>= 0011
            loop 3 : x = 0011
                0011 & 0001 = 0001
                x >>>= 0001
            loop 4 : x = 0001
                0001 & 0001 = 0001
                x >>>= 0000
         */
    }

    public static short parity(long x){
        short result = 0;
        while(x != 0){
            //& = bitwise and
            //^ = bitwise XOR
            result ^= (x & 1); //result = result ^ ( x & 1 )
            x >>>= 1;
            System.out.println("x : " + x);
        }
        return result;
        /*
        int 13
        loop 1 : x = 1101
            1101 & 0001 = 0001
            result = 0000 ^ ( 0001 )
            result = 0001
            x >>>= 0110
        loop 2 : x = 0110
            0110 & 0001 = 0000
            result = 0001 ^ ( 0000 )
            result = 0001
            x >>>= 0011
        loop 3 : x = 0011
            0011 & 0001 = 0001
            result = 0001 ^ ( 0001 )
            result = 0001
            x >>>= 0001
        loop 4 : x = 0001
            0001 & 0001 = 0001
            result = 0001 ^ ( 0001 )
            result = 0001
            x >>>= 0000
         */
    }
}

/*
a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011
 */
