package com.erick.morales;

public class calculadora
{
    int num1;
    int num2;

    public calculadora(int n1, int n2)
    {
        this.num1=n1;
        this.num2=n2;
    }
    public static int sumar(int n, int m){
        return n+m;
    }
    public static int restar(int n, int m){
        return n-m;
    }
    public static int dividir(int n, int m){
        return n / m;
    }
    public static int multiplicar(int n, int m){
        return n*m;
    }
    public boolean esPar(int n){
        return false;
    }
    public boolean esImpar(int n){
        return true;
    }
}