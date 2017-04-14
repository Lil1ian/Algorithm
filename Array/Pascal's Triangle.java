public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> pre = new ArrayList<Integer>();
        int tmp=0;
        int i, j;
        if(numRows<=0) return res;
        
        for(i=0; i<numRows; i++)
        {
            List<Integer> cur = new ArrayList<Integer>();
            cur.add(1);
            for(j=1; j<i; j++)
            {
                pre = res.get(i-1);
                cur.add(pre.get(j-1)+pre.get(j));
            }
            if(i!=0) cur.add(1);
            res.add(cur);
        }
        return res;
    }
}
