class Solution {
public:
bool isvowel(char ch){
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
}
    string reverseVowels(string s) {
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(isvowel(s[i])&&isvowel(s[j])){
            swap(s[i],s[j]);
            i++;
            j--;
            } 
            else if(!isvowel(s[i]))i++;
            else{
                j--;
            }

        }
        return s;
    }
};