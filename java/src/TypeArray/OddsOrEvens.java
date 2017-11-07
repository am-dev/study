package TypeArray;

public class OddsOrEvens {

    public static void OddsOrEvens(int[] A){
        int nextEven = 0, nextOdd = A.length -1;
        while(nextEven > nextOdd) {
            if ( A[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = A[nextEven];
                A[nextEven] = A[nextOdd];
                A[nextOdd--] = temp;
            }
        }
        
    }
}
