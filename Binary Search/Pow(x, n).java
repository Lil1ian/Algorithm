public class Solution {
    public double myPow(double x, int n) {
        if(n<0) return 1/pow(x, n);
        else return pow(x, n);
    }
    private double pow(double x, int n) {
        if(n==0) return 1;
        else if(n==1) return x;
        else {
            double p = pow(x, n/2);
            if(n%2==0) return p*p;
            else return p*p*x;
        }
    }
}
