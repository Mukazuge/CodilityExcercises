// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");
/*
* I want to improve it until i get the full correctness test
*
* simple_positive
 simple test with positive numbers, length = 5	1.349 s	WRONG ANSWER
 got 8 expected 4
 simple_negative
 simple test with negative numbers, length = 5	1.355 s	WRONG ANSWER
 got 9 expected 3
 small_random
 random small, length = 100	1.356 s	WRONG ANSWER
 got 11711 expected 39
 small_range
 range sequence, length = ~1,000	1.247 s	WRONG ANSWER
 got 496502 expected 56
 small
* */


class Solution {
    public int solution(int[] A) {
        int minValue = 0;
        int firstValue = 0;
        int secondValue = 0;
        int[] firstValueArr = new int[A.length-1];
        int[] secondValueArr = new int[A.length-1];
        int[] results = new int[A.length];

        for(int i = 0; i< A.length-1; i++){

            firstValue += A[i];
            secondValue += A[(A.length-1) - i];
            firstValueArr[i] = firstValue;
            secondValueArr[i] = secondValue;
        }

        for(int j = 0; j < A.length-1;j++){
            results[j] = Math.abs(firstValueArr[j] - secondValueArr[(secondValueArr.length-1) - j]);
            //System.out.println("first value of first array: " + firstValueArr[j]);
            //System.out.println("last value of second array: " + secondValueArr[(secondValueArr.length-1) - j]);
            //System.out.println("result: " + results[j]);

            if(j > 1 && results[j] > results[j-1]){
                minValue = results[j-1];
            }
            else{
                minValue = results[j];
            }
        }

        return minValue;
    }
}
