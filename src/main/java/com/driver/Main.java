package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        P p = new P();
        System.out.println(p.meth());
        System.out.println(b.meth());
    }
}


class P{
    String meth(){
        String p = "Invoking method from class P";
        return p;
    }
}



class B extends P{
    String meth(){
        String p = "Method is overridden in Extendend class B";
        return p;
    }
}