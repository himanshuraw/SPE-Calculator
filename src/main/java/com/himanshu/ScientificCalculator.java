package com.himanshu;

public class ScientificCalculator {
    public long add(long a, long b) {
        return a + b;
    }

    public long substract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long divide(long a, long b) {
        return a / b;
    }

    public long mod(long a, long b) {
        return a % b;
    }

    public double sqrt(double n){
        return Math.sqrt(n);
    }

    public long factorial(int n){
        long ans = 1;
        for(int i = 2; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

    public double naturalLog(double n){
        return Math.log(n);
    }

    public double power(double n, double exp){
        return Math.pow(n, exp);
    }
}
