public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];
        String current;
        int index = first.length();
        for (int i = 0; i < first.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                current = strs[j];
                if (i >= current.length() || first.charAt(i) != current.charAt(i)) {
                    return first.substring(0,i);
                }
            }
            index = i;
        }
        return first.substring(0,index);
    }
}
