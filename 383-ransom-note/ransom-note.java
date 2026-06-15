class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        for (char ch : magazine.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (!mpp.containsKey(c) || mpp.get(c) == 0) {
                return false;
            }
            mpp.put(c, mpp.get(c) - 1);
        }

        return true;
    }
}