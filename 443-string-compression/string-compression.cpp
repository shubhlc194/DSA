class Solution {
public:
    int compress(vector<char>& chars) {
        int index = 0;  // Position to write in the chars array
        int i = 0;
        int n = chars.size();
        
        while (i < n) {
            char curr_char = chars[i];
            int count = 0;

            // Count occurrences of the current character
            while (i < n && chars[i] == curr_char) {
                count++;
                i++;
            }

            // Write the character
            chars[index++] = curr_char;

            // If count > 1, write its digits
            if (count > 1) {
                string cnt_str = to_string(count);
                for (char c : cnt_str) {
                    chars[index++] = c;
                }
            }
        }

        return index; // Return the length of the compressed array
    }
};
