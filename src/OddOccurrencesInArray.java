import java.util.Arrays;

public class OddOccurrencesInArray {

    public void testConcatenate() {

        System.out.println("wer");
    }


    public static void main( String[] args ){

       // int[] A = {9,3,9,3,7,9,9};
        int[] A = {9,3,9,3,9,9,11};
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int target = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(i % 2 == 0){
                if(i == A.length - 1){
                    target = A[i];
                    break;
                }
                if(A[i] != A[i + 1]){
                    target = A[i];
                    break;
                }
            }
        }

                System.out.println(target);
    }


}
