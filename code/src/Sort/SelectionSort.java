package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectSort(int[] nums) {
        for(int i = 0; i < nums.length; i ++) {
            int minIndex = i;
            for(int j = i; j < nums.length; j ++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }

            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] i = {1,4,35,6,67,45,34,64,};
        selectSort(i);
        System.out.println(Arrays.toString(i));
    }
}
