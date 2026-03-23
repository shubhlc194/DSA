class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;

        int ls = 0;
        for (int i = 0; i < k; i++) {
            ls += arr[i];
        }
    int ans = ls;
        int rs = 0;
        for (int i = 0; i < k; i++) {
            ls -= arr[k - 1 - i];  
            rs += arr[n - 1 - i];   

            ans = Math.max(ans, ls + rs);
        }

        return ans;
    }
}