/*
392. Is Subsequence
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some
(can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Input: s = "abc", t = "ahbgdc"
Output: true

Input: s = "axc", t = "ahbgdc"
Output: false
 */
public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        char[] ss = s.toCharArray();
        char[] tt=t.toCharArray();
        int i=0,j=0;
        while(i<tt.length){
            if(ss[j]==tt[i]){
                j++;
            }
            i++;
            if(j==ss.length) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }
}
