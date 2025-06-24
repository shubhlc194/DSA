
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        int uniqueTypes = set.size();
        return Math.min(uniqueTypes, candyType.length / 2);
    }
}
