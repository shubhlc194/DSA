class Solution {
public:
    bool repeatedSubstringPattern(string s) {
        int n = s.length();

        // Try all possible substring lengths from n/2 down to 1
        for (int l = n / 2; l >= 1; l--) {
            if (n % l == 0) {  // Only consider lengths that divide n evenly
                int times = n / l;
                string pattern = s.substr(0, l);
                string newStr = "";

                // Repeat the pattern 'times' times
                while (times--) {
                    newStr += pattern;
                }

                // Check if the repeated pattern equals the original string
                if (newStr == s)
                    return true;
            }
        }

        return false;  // No valid pattern found
    }
};
