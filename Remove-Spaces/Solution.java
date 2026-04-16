class Solution {
    String removeSpaces(String s) {
        String t="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                t+=ch;
            }
        }
        return t;
    }
}