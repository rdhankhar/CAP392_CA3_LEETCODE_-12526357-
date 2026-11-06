// LeetCode 65 - Valid Number
class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        if (s.length() == 0) {
            return false;
        }

        return s.matches("[+-]?((\\d+(\\.\\d*)?)|(\\.\\d+))([eE][+-]?\\d+)?");
    }
}
