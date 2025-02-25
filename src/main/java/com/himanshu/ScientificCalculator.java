package com.himanshu;

public class ScientificCalculator {

    public double sqrt(double n){
        return Math.sqrt(n);
    }

    public long factorial(long n){
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
