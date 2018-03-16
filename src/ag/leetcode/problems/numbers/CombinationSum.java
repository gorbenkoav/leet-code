package ag.leetcode.problems.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> accumulator = new ArrayList<>();
        searchSum(candidates, target, accumulator, new ArrayList<>(), 0);
        return accumulator;
    }

    private void searchSum(int[] candidates, int target, List<List<Integer>> accumulator,
                           List<Integer> sequence, int sum) {
        for (int candidate : candidates) {

            processCandidate(sequence, accumulator, c -> c + sum == target, candidate,
                    (s, a) -> a.add(new ArrayList<>(s)));

            processCandidate(sequence, accumulator, c -> c + sum < target, candidate,
                    (s, a) -> searchSum(candidates, target, a, s, sum + candidate));

//            if (candidate + sum == target) {
//                sequence.add(candidate);
//                accumulator.add(new ArrayList<>(sequence));
//                sequence.remove(sequence.size() - 1);
//            } else if (candidate + sum < target) {
//                sequence.add(candidate);
//                searchSum(candidates, target, accumulator, sequence, sum + candidate);
//                sequence.remove(sequence.size() - 1);
//            }
        }
    }

    private void processCandidate(List<Integer> sequence,
                                  List<List<Integer>> accumulator,
                                  IntPredicate condition,
                                  int candidate,
                                  BiConsumer<List<Integer>, List<List<Integer>>> searcher) {
        if (condition.test(candidate)) {
            sequence.add(candidate);
            searcher.accept(sequence, accumulator);
            sequence.remove(sequence.size() - 1);
        }
    }

}
