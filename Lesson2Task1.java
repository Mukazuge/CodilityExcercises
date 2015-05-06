// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int isPermutation = 0;
        int totalValueA = 0;
        int suposedValue = 0;

        for(int i = 0; i < A.length; i++){
            totalValueA += A[i];
            suposedValue  += (i+1);
        }

        if(totalValueA == suposedValue){
            isPermutation++;
        }

        return isPermutation;
    }
}