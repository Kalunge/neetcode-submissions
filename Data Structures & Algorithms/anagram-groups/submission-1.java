class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        int sLen = strs.length;
        boolean[] visited = new boolean[sLen];

        for(int i = 0; i < sLen; i++){
            if(visited[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;


            for(int j = i + 1; j < sLen; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }


    private boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int ct : count){
            if(ct != 0){
                return false;
            }
        }

        return true;
    }
}
