public class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry=0, res, sum;
        int al, bl;
        int i=0;
        StringBuilder s = new StringBuilder();
            while((m-1-i)>=0 && (n-1-i)>=0)
            {
                al = a.charAt(m-1-i) - '0';
                bl = b.charAt(n-1-i) - '0';
                sum = (al+bl+carry)%2;
                s.append(sum);
                if((al+bl+carry)>=2) carry=1;
                else carry=0;
                i++;
            }
            while((n-1-i)>=0)
            {
                bl = b.charAt(n-1-i) - '0';
                sum = (carry+bl)%2;
                s.append(sum);
                if(carry+bl==2) carry=1;
                else carry=0;
                i++;
            }
            while((m-1-i)>=0)
            {
                al = a.charAt(m-1-i) - '0';
                sum = (carry+al)%2;
                s.append(sum);
                if(al+carry==2) carry=1;
                else carry=0;
                i++;
            }
        
        if(carry>0) s.append(carry);
        return s.reverse().toString();
    }
}
