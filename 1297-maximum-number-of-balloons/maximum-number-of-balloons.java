class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = 0;

        while (true) {
            HashMap<Character, Integer> mpp = new HashMap<>();
            mpp.put('b', 1);
            mpp.put('a', 1);
            mpp.put('l', 2);
            mpp.put('o', 2);
            mpp.put('n', 1);
            for (char ch : text.toCharArray()) {
                if (mpp.containsKey(ch)) {
                    mpp.put(ch, mpp.get(ch) - 1);
                    if (mpp.get(ch) == 0) {
                        mpp.remove(ch);
                    }
                }
            }

            if (mpp.size() == 0) {
                ans++;
                text = text.replaceFirst("b", "");
                text = text.replaceFirst("a", "");
                text = text.replaceFirst("l", "");
                text = text.replaceFirst("l", "");
                text = text.replaceFirst("o", "");
                text = text.replaceFirst("o", "");
                text = text.replaceFirst("n", "");
            } else {
                break;
            }
        }

        return ans;
    }
}