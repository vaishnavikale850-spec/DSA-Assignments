class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean isPan = false;
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch >='a' && ch<='z'){
                hs.add(ch);
            }
        }
        if(hs.size() == 26){
            isPan = true;
        }
        return isPan;
    }
}