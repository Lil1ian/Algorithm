public class Solution {
    public int nthUglyNumber(int n) {
        if(n<=0) return 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int i=0, j=0, k=0;
        int m2, m3, m5;
        int min;
        while(list.size()<n)
        {
            m2 = list.get(i)*2;
            m3 = list.get(j)*3;
            m5 = list.get(k)*5;
            min = Math.min(m2, Math.min(m3, m5));
            list.add(min);
            if(m2==min)
                i++;
            if(m3==min)
                j++;
            if(m5==min)
                k++;
        }
        return list.get(list.size()-1);
    }
}
