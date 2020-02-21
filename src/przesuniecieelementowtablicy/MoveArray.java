package przesuniecieelementowtablicy;

import java.util.Arrays;

public class MoveArray {
    public static int[] moveArray(int[] array, int N) {
        if(array == null)
            return null;
        else if(N >= array.length || N <= 0)
            return array;
        int firstIndexes = 0;
        int[] newArray = new int[array.length];
        for (int index = 0; index < newArray.length; index++) {
            if(index + N < newArray.length)
                newArray[index + N] = array[index];
            else {
                newArray[firstIndexes] = array[index];
                firstIndexes++;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = null;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(moveArray(array,3)));
        System.out.println(Arrays.toString(array));
    }
}
