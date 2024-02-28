package org.example.Example6;

import java.util.ArrayList;
import java.util.List;

/*
Пример 1:
Ввод: nums = [1,3,5,6], target = 5
Вывод: 2

Пример 2:
Ввод: nums = [1,3,5,6], target = 2
Вывод: 1

Пример 3:
Ввод: nums = [1,3,5,6], target = 7
Вывод: 4
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        searchInsert(nums, target);
    }
    public static int searchInsert(int[] nums, int target) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            integerList.add(nums[i]);
        }
        if (integerList.contains(target)) {
            int index = 0;
            for (int i = 0; i < integerList.size(); i++) {
                if (integerList.get(i) == target) {
                    index = i;
                }
            }
            System.out.println(index);
            return index;
        } else {
            int left = 0;
            int right = integerList.get(integerList.size() - 1);
            for (left = 0; left < right; left++) {
                for (int i = 0; i < integerList.size(); i++) {

                }
            }
        }
        return 0;
    }
}
