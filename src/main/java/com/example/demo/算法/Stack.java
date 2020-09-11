package com.example.demo.算法;

public class Stack {
    private Integer list[];
    private int top;
    public Stack(Integer[] list) {
        this.list = list;
        top = 0;
    }

    public Integer push(Integer n){
        if(top >= list.length){
            return null;
        }else{
            list[top++] = n;
        }
        return n;
    }
    public Integer pop(){
        if(top > 0){
            return list[--top];
        }else{
            return null;
        }
    }
    public Integer top(){
        if(top > 0){
            return list[top-1];
        }else{
            return null;
        }
    }

    public static void main(String args[]){
        Stack stack = new Stack(new Integer[10]);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
