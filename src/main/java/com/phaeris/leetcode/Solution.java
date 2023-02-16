package com.phaeris.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wyh
 * @since 2023/2/16
 */
public class Solution {

    /**
     * @see <a href="https://leetcode.cn/problems/maximum-number-of-pairs-in-array">2341</a>
     */
    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, List<Integer>> numGroups = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(x -> x));
        int pairs = 0;
        int remainder = 0;
        for (List<Integer> value : numGroups.values()) {
            int size = value.size();
            pairs += size / 2;
            if (size % 2 > 0) {
                remainder++;
            }
        }
        return new int[]{pairs, remainder};
    }
}
