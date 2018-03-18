package ag.leetcode.problems.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum/description/
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> accumulator = new ArrayList<>();
        Arrays.sort(candidates);
        searchSum(candidates, target, accumulator, new ArrayList<>(), 0, candidates[0]);
        return accumulator;
    }

    private void searchSum(int[] candidates, int target, List<List<Integer>> accumulator,
                           List<Integer> sequence, int sum, int currentValue) {
        for (int candidate : candidates) {
            if (candidate >= currentValue) {
                if (candidate + sum == target) {
                    sequence.add(candidate);
                    if (accumulator.stream().noneMatch(
                            i -> i.equals(sequence))) {
                        accumulator.add(new ArrayList<>(sequence));
                    }
                    sequence.remove(sequence.size() - 1);
                } else if (candidate + sum < target) {
                    sequence.add(candidate);
                    searchSum(candidates, target, accumulator, sequence, sum + candidate, candidate);
                    sequence.remove(sequence.size() - 1);
                }
            }
        }
    }

}
