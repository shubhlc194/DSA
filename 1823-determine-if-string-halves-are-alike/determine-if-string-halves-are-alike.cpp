class Solution {
public:
bool isvowel(char &ch){
    return ch=='a' ||ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A' ||ch=='E' ||ch=='I'||ch=='O' || ch=='U';
}
    bool halvesAreAlike(string s) {
        int n=s.length();
        int i=0;
        int j=n/2;
        int cl=0;
        int cr=0;
        while(i<n/2 && j<n){
       if(isvowel(s[i]))cl++;
       if(isvowel(s[j]))cr++;
       i++;
       j++;
        }
        return cl==cr;
    }
};