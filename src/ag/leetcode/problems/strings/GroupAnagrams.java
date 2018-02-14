package ag.leetcode.problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/group-anagrams/description/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(
                Arrays.stream(strs)
                        .collect(
                                Collectors.groupingBy(
                                        s -> Stream.of(s.split("")).sorted().collect(Collectors.joining()))
                        ).values());
    }
}
