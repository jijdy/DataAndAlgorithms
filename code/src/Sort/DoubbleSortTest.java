package Sort;

import java.util.Arrays;

public class DoubbleSortTest {
    public static void bubbleSort(int[] nums) {
        boolean flag = true;//标志位为假则表示交换过，否则跳出排序
        for(int i = 0; i < nums.length; i ++) {
            for(int j = 1; j < nums.length - i; j++) {
                if(nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                    flag = false;
                }
            }
            if(!flag) break;
            flag = true;
        }
    }

    //进行交换的辅助函数
    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
        int[] i = {1,4,35,6,67,45,34,64,};
        DoubbleSortTest.bubbleSort(i);
        System.out.println(Arrays.toString(i));
    }
}
