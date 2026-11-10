class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAna = true;
        List<Character> list = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        for(int i = 0; i<t.length(); i++){
            if(list.contains(t.charAt(i))){
                list.remove(list.indexOf(t.charAt(i)));
            }else{
                isAna = false;
                break;
            }
        }
        if(!(list.size() == 0)){
            isAna = false;
        }
        return isAna;
    }
}