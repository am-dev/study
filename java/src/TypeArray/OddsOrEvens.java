package TypeArray;

public class OddsOrEvens {
//method to order an array by odd and even numbers
    public static void OddsOrEvens(int[] A){
        int nextEven = 0, nextOdd = A.length -1;

        System.out.println(nextOdd);
        System.out.println(A[nextOdd]);
        while(nextEven < nextOdd) {
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
