class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomNoteMap = new HashMap<Character, Integer>();
        Map<Character, Integer> magazineMap = new HashMap<Character, Integer>();
        for(int i = 0; i < ransomNote.length(); i++) {
            ransomNoteMap.put(ransomNote.charAt(i),
            ransomNoteMap.getOrDefault(ransomNote.charAt(i), 0) + 1
            );
        }
        for(int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i),
            magazineMap.getOrDefault(magazine.charAt(i), 0) + 1
            );
        }
        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet())     {
            Character key = entry.getKey();
            if(!magazineMap.containsKey(key) || ( magazineMap.get(key) - ransomNoteMap.get(key) < 0)) {
                return false;
            }
        }
        return true;
    }
}