import java.util.*;

class Solution {

    public boolean backspaceCompare(String s, String t) {
        return convert(s).toString().equals(convert(t).toString());
    }

    private Deque<Character> convert(String s) {
        Deque<Character> dq = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!dq.isEmpty()) {
                    dq.pollLast();
                }
            } else {
                dq.offerLast(ch);
            }
        }

        return dq;
    }
}