package com.example.kalkulator23;

public class Calculator {
    public int saberi(int a, int b){
        return a+b;
    }
    
    public int oduzmi(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator k1=new Calculator();
        int rez= k1.saberi(5,8);
        System.out.println("rezultat je :" + rez);
    }

}
