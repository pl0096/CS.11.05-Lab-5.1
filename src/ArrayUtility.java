public class ArrayUtility {

    public static void print(int[] array) {
        for(int i : array){
            System.out.println(i);
        }
    }

    public static int sum(int[] array) {
        int result = 0;
        for(int i : array){
            result += i;
        }
        return result;
    }

    public static double average(int[] array) {
        double result = sum(array);
        result = result / array.length;
        result = Math.round(result * 100.0) / 100.0;

        return result;
    }

    public static int minimum(int[] array) {
        int min;
        min = array[0];
        for(int i : array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max;
        max = array[0];
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int count = 0;
        for(int i : array){
            if(i%2 == 0) {count++;}
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int[] newArray = new int[array.length];
        int idx = array.length - 1;
        for(int i : array){
            newArray[idx] = i;
            idx--;
        }
        return newArray;
    }

    public static void reverseTwo(int[] array) {
        int [] newArray = new int[array.length];
        int idx = 0;
        for(int i : array){
            newArray[idx] = i;
            idx++;
        }
        idx = array.length - 1;
        for(int i = 0; i < array.length; i++){
            array[i] = newArray[idx];
            idx--;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i : array){
            if (i == num){
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(String i : array){
            if (i.equals(str)){
                return true;
            }
        }
        return false;    }

    public static void multiplyByTwo(int[] array) {
        int ii = 0;
        for(int i=0; i < array.length; i++){
            array[i] = array[i] * 2;

        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] * n;
        }
    }

    public static String toString(int[] array) {
        String newArray = "";
        String str;
        String s = "";
        for(int i = 0; i < array.length; i++){
            str = Integer.toString(array[i]);
            newArray = newArray + s + str;
            s = ", ";
        }
        return newArray;
    }

    public static boolean twoSum(int[] array, int num) {
        int ii = 0;
        for(int i : array){
            for(int a = 0; a < array.length; a++){
                if(a != ii && i + array[a] == num) {
                    return true;
                }
            }
            ii++;
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] arr = new int[array.length];
        int idx = 0;
        for(int i : array){
            arr[idx] = i;
            idx++;
        }
        if (array.length - 2 >= 0) System.arraycopy(arr, 0, array, 1, array.length - 2);
        array[array.length - 1] = arr[array.length - 2];
        array[0] = arr[arr.length - 1];
    }

    public static void shiftLeft(int[] array) {
        int[] arr = new int[array.length];
        int idx = 0;
        for(int i : array){
            arr[idx] = i;
            idx++;
        }

        if (array.length - 1 >= 0) System.arraycopy(arr, 1, array, 0, array.length - 1);
        array[array.length-1] = arr[0];
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for(int i = 0; i < n; i++){
            shiftRight(array);
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        for(int i = 0; i < n; i++){
            shiftLeft(array);
        }


    }


}
