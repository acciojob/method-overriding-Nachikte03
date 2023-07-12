package com.driver;

public class Main {
    public static void main(String[] args) {
        A b = new B();
        A p = new A();
        System.out.println(p.meth());
        System.out.println(b.meth());
    }
}


class A{
    public String meth(){
        return "Invoking method from class A";
    }
}



class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}