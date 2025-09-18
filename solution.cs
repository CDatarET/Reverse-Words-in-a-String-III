public class Solution {
    public string ReverseWords(string s) {
        string[] strs = s.Split(" ");
        for(int i = 0; i < strs.Length; i++){
            char[] chars = strs[i].ToCharArray();
            Array.Reverse(chars);
            strs[i] = new string(chars);
        }
        string ret = String.Join(" ", strs);
        return(ret);
    }
}
