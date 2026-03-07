class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            // use 26 character to count frequency of each int
            int[] freq = new int[26];

            for(char c : s.toCharArray()){
                freq[c -'a']++;
            }

            // use string as key
            String key = Arrays.toString(freq);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}