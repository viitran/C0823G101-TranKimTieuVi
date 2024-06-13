package com.example.algorithm;

public class Prime {
    public void finalize() {
        System.out.println("finalize called");
    }
    public static void main(String[] args) {
        Prime f1 = new Prime();
        Prime f2 = new Prime();
//        f1 = null;
//        f2 = null;
//        System.gc();
    }
}
