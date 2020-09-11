package com.example.demo.算法;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTree {
    public static void main(String args[]){
        DictionaryTree dictionaryTree = new DictionaryTree();
    }




    private final Node root = new Node(null,0);
    public void add(String c){
        Node root1 = root;
        for(int i = 0; i < c.length(); i++){
            Character character = new Character(c.charAt(i));
            Node newNode;
            //如果有这个字符，节点newNode保存这个字符所在的节点
            if((newNode = root1.getNodes().get(character)) == null){
                //没有这个字符
                newNode = new Node(character, 1);
                root1.getNodes().put(character, newNode);
            }
            newNode.setTime(newNode.getTime()+1);
            root1 = newNode;
        }
    }

    public boolean contain(String str){
        Node root1 = root;
        for(int i = 0; i < str.length(); i++){
            Character character = new Character(str.charAt(i));
            Node newNode;
            //如果有这个字符，节点newNode保存这个字符所在的节点
            if((newNode = root1.getNodes().get(character)) != null){
                //有这个字符
                root1 = newNode;
                continue;
            }
            return false;
        }
        return true;
    }


    private class Node{
        private Character c;
        private int time;
        private HashMap<Character, Node> nodes = new HashMap<>(8);

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public Node(Character c, int time) {
            this.time = time;
            this.c = c;
        }

        public Character getC() {
            return c;
        }

        public void setC(Character c) {
            this.c = c;
        }

        public HashMap<Character, Node> getNodes() {
            return nodes;
        }

        public void setNodes(HashMap<Character, Node> nodes) {
            this.nodes = nodes;
        }
    }
}

