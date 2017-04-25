public class Solution {
    public boolean isValid(String s) {
        if(s.length()==1 || s==null) return false;
        int n = s.length();
        Stack<Character> t = new Stack<Character>();
        for(int i=0; i<n; i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') t.push(s.charAt(i));
            else {
                if(t.size()==0) return false;
                char top = t.pop();
                if(s.charAt(i)==')') {
                    if(top!='(') return false;
                }
                if(s.charAt(i)==']') {
                    if(top!='[') return false;
                }
                if(s.charAt(i)=='}') {
                    if(top!='{') return false;
                }
            }
        }
        return t.size()==0;
    }
}
