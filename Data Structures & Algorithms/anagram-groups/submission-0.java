class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //first step check if array is not empty;
        //2nd make HashMap this will store key which will be frequencymap and value will be list of all other strings in the array that match it.
        //create frequency map array with 26;
        //intialize first key
        //make it a string with string builder and look for all values in the array that match the key
        //repeat this until all strings have been checked so one pass of the array;
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String, List> ansMap = new HashMap<>();
        int [] freq = new int[26];
        for(String s: strs){
            Arrays.fill(freq,0);
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            //loop to build the string that will be used as a key;
            for(int i = 0; i<26; i++ ){
                sb.append('#');
                sb.append(freq[i]);
            }
            String key = sb.toString();
            if(!ansMap.containsKey(key)){
                ansMap.put(key, new ArrayList());
            }ansMap.get(key).add(s);
        }
        return new ArrayList(ansMap.values());
    }
}
