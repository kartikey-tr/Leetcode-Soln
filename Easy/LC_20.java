// Created a list and started storing the expected closing brackets while moving with the
// charArray of string.
// if no opening brackets are there tried matching it with the last element of the list.
// If match found then remove the last element from list.
// In the end, if list is empty then string is valid.

class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') list.add(')');
            else if (ch == '{') list.add('}');
            else if (ch == '[') list.add(']');

            else {
                if (list.size() == 0 || list.get(list.size() - 1) != ch) {
                    return false;
                }
                list.remove(list.size() - 1);
            }
        }

        return list.size() == 0;
    }
}