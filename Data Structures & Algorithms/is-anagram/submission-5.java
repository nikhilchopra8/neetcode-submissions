class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        for(int i = 0; i < sSort.length; i++){
            if(sSort[i] != tSort[i]){
                return false;
            }
        }

        return true;
    }
}
