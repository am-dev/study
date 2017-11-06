package testing;

public class thisisatest {

    public static void main(String args[]){
        countsBits cb = new countsBits();
        //7 = 00000111
        //12 = 00001100
        //13 = 00001101
        System.out.println("Parity :" + cb.parity(13));
        System.out.println("Bit count :" + cb.countBits(15));

    }
}
