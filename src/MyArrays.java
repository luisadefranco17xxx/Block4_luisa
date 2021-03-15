import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] my_array={1,2,3,4};
        int[] my_newArray= new int[4];
        printArray(my_array);

        System.out.println(containsNumber(my_array,2));
        System.out.println(calculateSumm(my_array));

        System.out.println(Arrays.toString(reverse(my_array)));

    }

    public static void printArray(int[] my_array){
        for (int i = 0; i < my_array.length; i++) {
            System.out.println(my_array[i]);
        }

    }

    public static boolean containsNumber(int[] my_array, int value) {
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i]==value) {
                return true;
            }
        }
        return false;
    }

    public static int calculateSumm(int[] my_array){
        int sum=0;
        for (int i = 0; i < my_array.length; i++) {
            sum=sum+my_array[i];
        }
        return sum;
    }

    public static int[] reverse(int[] my_array) {
        int[]  new_array= new int[my_array.length];
        for (int i = 0; i < my_array.length; i++) {
            new_array[i]=my_array[my_array.length-1-i];
        }
        
        return new_array;
    }
}
