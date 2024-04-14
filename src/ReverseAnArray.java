import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int length = array.length;

        for (int i=0; i< array.length / 2; i++){
            int temp = array[i];

            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

    }
}
