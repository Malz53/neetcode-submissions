class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> unique = new HashSet<>();
        for(int i : nums){
            if(unique.contains(i)){
                return true;
            }unique.add(i);
        }return false;
    }
}