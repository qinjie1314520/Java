package com.example.demo.learn.代理.关于代理部分的研究;

public class 静态代理 {

    public static void main(String args[]){
        B b = new B(new A());
        b.say();
    }

    static class A{
        void say(){
            System.out.println("A:say");
        }
    }
    static class B{
        private A a;
        public B(A aa){a = aa;}
        void say(){
            System.out.println("Before");
           a.say();
            System.out.println("After");
        }
    }
}
