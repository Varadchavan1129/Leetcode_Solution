class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();

        for(List<String> k: knowledge) {
            map.put(k.get(0),k.get(1));
        }

        String[] words = s.split("[()]");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<words.length;i++){
            if(i%2==0){
                sb.append(words[i]);
            }
            else {
                sb.append(map.getOrDefault(words[i],"?"));
            }
        }

        return sb.toString();
    }
}