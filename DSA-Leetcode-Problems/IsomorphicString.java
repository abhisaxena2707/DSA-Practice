import java.util.HashMap;
import java.util.Map;
/*
205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character, but a character
may map to itself.

Input: s = "egg", t = "add"
Output: true

Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true

 */
public class IsomorphicString {

        public static boolean isIsomorphic(String s, String t) {

            Map<Character,Character> map= new HashMap<>();
            if(s.length()!=t.length()) return false;
            for(int i=0;i<s.length();i++) {
                if(map.containsKey(s.charAt(i))) {
                    if(map.get(s.charAt(i))!=t.charAt(i)) return false;
                }
                else if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i),t.charAt(i));
                }
                else {
                    return false;
                }

            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
    }

    }

