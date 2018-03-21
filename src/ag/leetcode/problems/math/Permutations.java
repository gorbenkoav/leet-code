package ag.leetcode.problems.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/permutations/description/
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        long permutationNum = getPermutationNum(nums.length);
        List<List<Integer>> permutations =
                Stream.generate(ArrayList<Integer>::new).limit(permutationNum).collect(Collectors.toList());
        addNum(permutations, Arrays.stream(nums).boxed().collect(Collectors.toList()), 0);
        return permutations;
    }

    private void addNum(List<List<Integer>> permutations, List<Integer> notAdded, int offset) {
        long permutationNum = getPermutationNum(notAdded.size());
        int combinationNum = (int) (permutationNum / notAdded.size());
        for (int i = 0; i < notAdded.size(); i++) {
            for (int j = 0; j < combinationNum; j++) {
                permutations.get(offset + i * combinationNum + j).add(notAdded.get(i));
            }
            if (notAdded.size() > 1) {
                Integer removed = notAdded.remove(i);
                addNum(permutations, notAdded, offset + i * combinationNum);
                notAdded.add(i, removed);
            }
        }

    }

    private long getPermutationNum(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }
}
