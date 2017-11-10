public class Main {

    public static int[] josephusSimulation(int m, int n) {
        int[] arr = new int[m];
        int[] res = new int[m];
        int count = 0;
        int idx = 0;
        int tmp = 0;

        for(int i=0; i<m; i++) {
            arr[i] = i;
        }

        while(count<m) {
            tmp = (tmp+1) % m;
            if(arr[tmp] != -1) idx++;
            if(idx == n-1) {
                res[count] = arr[tmp];
                count++;
                arr[tmp] = -1;
                idx = -1;

            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] r = josephusSimulation(10, 3);
        for(int i=0; i<10; i++)
            System.out.print(r[i]+ " ");

    }

}











