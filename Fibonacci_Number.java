class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibonacci = fibnm1 + fibnm2;
        return fibonacci;
    }
}