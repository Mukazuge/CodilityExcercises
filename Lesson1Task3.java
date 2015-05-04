// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        /*
        un var de return
        un arrelo que guarde resultados y que compare con cada resultado anterior si es mayor este al pasado reescribre var
        */
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
