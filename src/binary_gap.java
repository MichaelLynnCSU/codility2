
// A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.


public class binary_gap {

    public int solution(int N) {
        // write your code in Java SE 8


        while (N > 0 && (N & 1) == 0) {
            N >>= 1;
        }


        int currentMax = 0;
        int mycount = 0;

        while (N > 0) {

            if ((N & 1) == 0) {

                mycount++;

            }

            else {

                currentMax = Math.max(currentMax, mycount);
                mycount = 0;

            }

            N >>= 1;

        }
        return currentMax;


    }


    public static void main( String[] args ){

         binary_gap b = new binary_gap();
         int ans1 = b.solution(9 );
         int ans2 = b.solution(32);
          int ans3 = b.solution(529 );
         System.out.println(ans1 + "  " + ans2 + "    " + ans3);

    }

}
