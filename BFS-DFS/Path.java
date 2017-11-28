/*
import java.util.*;

public class Solution {


    public class Node {
        int id;
        int val;
        ArrayList<Integer> sons;
        Node(int id, int val) {
            this.id = id;
            this.val = val;
            sons = new ArrayList<>();
        }

    }

    public int LongestPathWithSameValue(int[] A, int[] E) {
        int n = A.length;
        Node[] nodelist = new Node[n];

        for(int i=0; i<n; i++) {
            nodelist[i] = new Node(i, A[i]);
        }

        for(int j=0; j<n-1; j++) {
            int a = 2*j;
            int b = 2*j + 1;
            nodelist[E[a]-1].sons.add(E[b]-1);
            nodelist[E[b]-1].sons.add(E[a]-1);
        }

        int[] cnt = new int[n];
        int max = 0;
        for(int i=0; i<nodelist.length; i++) {
            for(int k=0; k<nodelist[i].sons.size(); k++) {
                int son_id = nodelist[i].sons.get(k);
                Node son = nodelist[son_id];

                if(nodelist[i].val == son.val) {
                    cnt[i]++;
                    cnt[son_id]++;
                }
                if(cnt[i] !=0 && cnt[son_id] != 0) {
                    cnt[i] = Math.max(cnt[i], cnt[son_id]);
                    cnt[son_id] = Math.max(cnt[i], cnt[son_id]);
                }
                max = Math.max(max, cnt[i]) + max;
            }
        }



        return max;
    }


}
*/


import java.util.ArrayList;
import java.util.Random;

public class Solution {

    private static int ans = 0;
    private static Node[] nodes;


    /**
     * Get the depth of root with the same value
     * @param rootId: current root id
     * @param faId: root's father id, to avoid endless recursion
     * @return int: the depth of subtree with the same value with the root
     */
    static int dfs(int rootId, int faId) {
        Node root = nodes[rootId];
        int deepestPath = 0, secondDeepPath = 0;
        //enumerate every son of root
        for (int i = 0; i < root.sons.size(); i++) {
            int sonId = root.sons.get(i);
            //if son is not father
            if (sonId != faId) {
                //get the depth of the son
                int sonPathDepth = dfs(sonId, rootId);
                Node son = nodes[sonId];
                //if son.val equals to root
                if (son.val == root.val) {
                    //update deepest, secondDeepest
                    // be careful
                    if (deepestPath < sonPathDepth) {
                        secondDeepPath = deepestPath;
                        deepestPath = sonPathDepth;
                    } else if (secondDeepPath < sonPathDepth) {
                        secondDeepPath = sonPathDepth;
                    }
                }
            }
        }
        //Update the answer = 2nd-deep + deepest + root-itself
        ans = Math.max(ans, secondDeepPath + deepestPath + 1);
        //return the depth though the deepest son path (has the same value)
        return deepestPath + 1;
    }

    static void solve(int[] A, int[] E) {
        int n = A.length;
        nodes = new Node[n];
        //get answer from A and E array
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i, A[i]);
        }
        for (int j = 0; j < n - 1; j++) {
            int a = E[2 * j] - 1;
            int b = E[2 * j + 1] - 1;
            nodes[a].sons.add(b);
            nodes[b].sons.add(a);
        }
        //pick any node as root, here I'm use random() to get
        //directly use: "int root = 0;" is also ok
        int root = new Random().nextInt(n);
        dfs(root, -1);
    }

    public static void main(String[] args) {
        int[] A = {1, 1, 1, 2, 2};
        int[] E = {1, 2, 1, 3, 2, 4, 2, 5};
        solve(A, E);
        System.out.println(ans);
    }

    static class Node {
        int id;
        int val;
        ArrayList<Integer> sons;

        Node(int id, int val) {
            this.id = id;
            this.val = val;
            sons = new ArrayList<>();
        }
    }

}

