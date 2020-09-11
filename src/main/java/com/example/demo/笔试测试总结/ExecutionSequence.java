package com.example.demo.笔试测试总结;

public class ExecutionSequence {

    //第一次选择的效果：4 2 3 1 5

    //实际效果：4 2 3 1 5
//    private int a = test1();
//    private static int aa = test11();
//
//    {
//        System.out.println("1");
//    }
//    static{
//        System.out.println("2");
//    }
//
//
//    private int test1(){
//        System.out.println("3");
//        return 100;
//    }
//    private static int test11(){
//        System.out.println("4");
//        return  1000;
//    }
//    public ExecutionSequence(){
//        System.out.println("5");
//    }

    //2 4 1 3 5
    public static void main(String args[]){
        new ExecutionSequence();
    }
    public ExecutionSequence(){
        System.out.println("5");
    }
    {
        System.out.println("1");
    }
    static{
        System.out.println("2");
    }


    private int a = test1();
    private static int aa = test11();



    private int test1(){
        System.out.println("3");
        return 100;
    }
    private static int test11(){
        System.out.println("4");
        return  1000;
    }
}
