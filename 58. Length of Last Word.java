class Solution {
    public int lengthOfLastWord(String s) {
        String[] value = s.split(" ");
        String text = value[value.length - 1];
        return text.length();
    }
}