package two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Создаем хэш-таблицу для хранения элементов и их индексов
        Map<Integer, Integer> map = new HashMap<>();

        int size = nums.length;
        // Обходим массив nums
        for (int i = 0; i < size; i++) {
            int complement = target - nums[i]; // Ищем число, которое в сумме с текущим элементом даст target

            // Если такое число уже было просмотрено, возвращаем его индекс и текущий индекс
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Добавляем текущий элемент и его индекс в хэш-таблицу
            map.put(nums[i], i);
        }

        // Если решение не найдено, возвращаем пустой массив
        return new int[] {};
    }
}
