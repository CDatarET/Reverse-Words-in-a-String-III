class Solution {
    public String reverseWords(String s) {
        String[] str1 = s.split(" ");
        String ret = "";
        for(int i = 0; i < str1.length; i++){
            String rev = "";
            for(int j = str1[i].length() - 1; j >= 0 ; j--){
                rev = rev + str1[i].charAt(j);
            }

            if(i == str1.length - 1){
                ret = ret + rev;
                break;
            }

            ret = ret + rev + " ";
        }
        return(ret);
    }
}
