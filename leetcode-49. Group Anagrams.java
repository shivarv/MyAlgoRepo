class Solution {
    public static String createHash(String str) {
        int[] charSet = new int[26];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            charSet[str.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(charSet[i] > 0) {
                sb.append((char) ('a' + i));
                sb.append(charSet[i]);
                sb.append('$');
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> output = new ArrayList<>();
       HashMap<String, List<String>> hashMapData = new HashMap<String, List<String>>();
       for(int i = 0; i < strs.length; i++) {
            String hashString = createHash(strs[i]);
            List<String> loopOutput = hashMapData.getOrDefault(hashString, new ArrayList<String>());
            loopOutput.add(strs[i]);
            hashMapData.put(hashString, loopOutput);
       }
        for (Map.Entry<String, List<String>> entry : hashMapData.entrySet())    {
            String key = entry.getKey();
            output.add(entry.getValue());
        }
        return output;
    }
}