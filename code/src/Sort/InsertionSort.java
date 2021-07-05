package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for(int i = 1; i < nums.length; i ++) {
            //拿出要插入的数据
            int num = nums[i];
            int j = i - 1;
            //进行插入寻找并连续的交换位置
            for(; j >= 0 && nums[j] > nums[i]; j--) {
                nums[j + 1] = nums[j];//循环的将已排序好的数组进行整体后移操作
            }
            nums[j + 1] = num;
        }
    }

    public static void main(String[] args) {
        int[] i = {1,4,35,6,67,45,34,64,};

        insertionSort(i);
        System.out.println(Arrays.toString(i));
    }
}
