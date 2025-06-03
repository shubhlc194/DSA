class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i=0;
        int j=0;
        int m=s.length();
        int n=t.length();
                if(m==0) return true;

        while(i<m && j<n){
            if(s[i]==t[j]){
                i++;
            }
                j++;
            
            if(i==m)return true;
        }
        return false;
    }
};