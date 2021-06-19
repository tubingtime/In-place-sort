package com.company;

public class Main {

    public int facc(int n){
        if(n == 0)
            return 0;
        int total = 1;
        for (int i = 1; i <= n; i++){
            total *= i;
            //System.out.println(total);
        }
        return total;
    }

    public int fibb(int n){
        int[] arr = new int[n];
        arr[1] = 1;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        Main manny = new Main();
        System.out.println(manny.fibb(20));
    }
}