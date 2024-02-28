package org.example.Example1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3};
//        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    /*
Учитывая массив целых чисел nums и целое число target, верните индексы двух чисел таким образом, чтобы они в сумме равнялись target.
Вы можете предположить, что каждый ввод будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
Вы можете вернуть ответ в любом порядке.
Пример 1:
Входные данные: nums = [2,7,11,15], target = 9
Выходные данные: [0,1]
Объяснение: Поскольку nums[0] + nums[1] == 9, мы возвращаем [0, 1].

Пример 2:
Входные данные: числа = [3,2,4], цель = 6 [2, 3, 4]
Выходные данные: [1,2]

Пример 3:
Входные данные: nums = [3,3], target = 6
Выходные данные: [0,1]
     */
    private static int[] twoSum(int[] nums, int target) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] + array[right] == target) {
                break;
            }
            if (array[left] + array[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        int[] arrayResult = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == array[left] && nums[i + 1] == array[right]) {
                arrayResult[0] = i;
                arrayResult[1] = i + 1;
            }
        }
        return arrayResult;
    }
}
