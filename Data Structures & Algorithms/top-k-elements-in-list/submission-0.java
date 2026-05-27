class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int[] result = new int[k];
        int index = list.size() - 1;

        for(int i = 0; i < k; i++){
            result[i] = list.get(index);
            index--;
        }

        return result;
    }
}
