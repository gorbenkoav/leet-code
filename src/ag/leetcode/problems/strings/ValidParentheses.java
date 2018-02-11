package ag.leetcode.problems.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

    private Map<Character, Character> brackets = new HashMap<>();
    {
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');
    }

    private Set<Character> open = new HashSet<>();
    {
        open.addAll(brackets.keySet());
    }

    private Set<Character> close = new HashSet<>();
    {
        close.addAll(brackets.values());
    }


    public boolean isValid(String s) {
        if(s == null || s.isEmpty()){
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char nextSymbol = s.charAt(i);
                if(open.contains(nextSymbol)){
                    stack.push(nextSymbol);
                } else if(close.contains(nextSymbol)){
                    if(stack.empty()){
                        return false;
                    }
                    Character stackSymbol = stack.pop();
                    if(!brackets.get(stackSymbol).equals(nextSymbol)){
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return stack.empty();
        }
    }
}
