class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().trim().replace(" ", "");
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);

            }
            
        }
        StringBuilder sb1=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb1.append(ch);

            }
            
        }
        return sb1.toString().equals(sb.reverse().toString());

        
    }
}
