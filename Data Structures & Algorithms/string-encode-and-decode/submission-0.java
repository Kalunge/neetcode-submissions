class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < strs.size(); i++){
            if(i != strs.size() - 1){
                builder.append(strs.get(i));
                builder.append(" ");
            }else{
                builder.append(strs.get(i));
            }
        }

        return builder.toString();
    }

    public List<String> decode(String str) {
        String[] strArray = str.split(" ");

        List<String> result = new ArrayList<>(Arrays.asList(strArray));

        return result;
    }
}
