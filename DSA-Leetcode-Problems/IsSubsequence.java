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
