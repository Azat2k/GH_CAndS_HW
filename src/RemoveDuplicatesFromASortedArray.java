import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,2};

        int[] removedDuplicates = RemoveDuplicatesFromASortedArray.removeDuplicete(nums);
        System.out.println(Arrays.toString(removedDuplicates));
    }
    public static int[] removeDuplicete(int[] nums){

        Arrays.sort(nums);
        ArrayList<Integer> unique = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(i==0 || nums[i] != nums[i-1]){
                unique.add(nums[i]);
            }
        }
        int[] result = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            result[i] = unique.get(i);
        }
        return result;
    }
}
