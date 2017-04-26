public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens==null || tokens.length==0) return 0;
        int n = tokens.length;
        Stack<Integer> s = new Stack<Integer>();
        int a, b, tmp;
        for(int i=0; i<n; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                if(s.size()>=2) {
                    a = s.pop();
                    b = s.pop();
                    if(tokens[i].equals("+")) tmp = b+a;
                    else if(tokens[i].equals("-")) tmp = b-a;
                    else if(tokens[i].equals("*")) tmp = b*a;
                    else tmp = b/a;
                    s.push(tmp);
                }
            }
            else s.push(Integer.parseInt(tokens[i]));
        }
        return s.pop();
    }
}
