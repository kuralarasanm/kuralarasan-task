// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//   (examples)
//   input: [1,2,8,9,12,46,76,82,15,20,30]
//   Output: 
//     {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int[] input = { 1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30 };
        int[] counts = new int[10]; // index 1..9
        System.out.println(counts.length);
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    counts[i]++;

                }
            }
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            result.put(i, counts[i]);
        }

        System.out.println(result);
    }
}
