import java.util.Arrays;

public class Arrays_CyclicRotation {


    public static void main( String[] args ){

        int[] A = {1,2};
        int[] B = Arrays.copyOf(A, A.length);
        int k = 1;
        if(k == A.length || A.length == 1){
            System.out.println(Arrays.toString(B));
        }
        else {
            for (int i = 0; i < A.length; i++) {
                if (k + i < A.length) {
                    B[i + k] = A[i];
                } else {
                    int temp = ((k + i) % (A.length));
                    B[temp] = A[i];
                }
            }
        }
        System.out.println(Arrays.toString(B));
    }



}
