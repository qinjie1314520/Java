package com.example.demo.exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Main dictionaryTree = new Main();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int num[] = new int[n];
            //添加元素
            for (int i = 0; i < n; i++) {
                num[i] = in.nextInt();
                dictionaryTree.add(toBinary(num[i], 17));
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                res += dictionaryTree.find(num[i], m, 17);
            }
            System.out.println((int) Math.ceil(res * 1.0 / 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private final Node root = new Node(null, 0);

    public void add(String c) {
        Node root1 = root;
        for (int i = 0; i < c.length(); i++) {
            Character character = new Character(c.charAt(i));
            Node newNode;
            //如果有这个字符，节点newNode保存这个字符所在的节点
            if ((newNode = root1.getNodes().get(character)) == null) {
                //没有这个字符
                System.out.println("没有字符，添加" + character);
                newNode = new Node(character, 1);
                root1.getNodes().put(character, newNode);
            } else {
                newNode.setTime(newNode.getTime() + 1);
                System.out.println("有字符，修改字符" + newNode.getC() + ",次数" + (newNode.getTime()));
            }
            root1 = newNode;
        }
    }

    public static String toBinary(int num, int digits) {
        int value = 1 << digits | num;
        String bs = Integer.toBinaryString(value); //0x20 | 这个是为了保证这个string长度是6位数
        return bs.substring(1);
    }

    public int find(int num, int m, int maxLen) {
        Node root1 = root;
//        int len = Integer.toBinaryString(num).length() > Integer.toBinaryString(m).length() ? Integer.toBinaryString(num).length() : Integer.toBinaryString(m).length();
        int len = maxLen;
        String numStr = toBinary(num, len);
        String mStr = toBinary(m, len);
        int res = 0;
        for (int i = 0; i < len; i++) {
            int numBit = Integer.parseInt("" + numStr.charAt(i));
            int mBit = Integer.parseInt("" + mStr.charAt(i));
            Node tmp0 = root1.getNodes().get('0');
            Node tmp1 = root1.getNodes().get('1');
            if (tmp0 == null && tmp1 != null) {
                //只有1孩子
                int tmp11 = Integer.parseInt("" + tmp1.getC());
                if ((tmp11 ^ numBit) > mBit) {
                    res += tmp1.getTime();
                    break;
                } else if ((tmp11 ^ numBit) == mBit) {
                    root1 = tmp1;
                } else {
                    break;
                }
            } else if (tmp1 == null && tmp0 != null) {
                //只有0孩子
                int tmp00 = Integer.parseInt("" + tmp0.getC());
                if ((tmp00 ^ numBit) > mBit) {
                    res += tmp0.getTime();
                    break;
                } else if ((tmp00 ^ numBit) == mBit) {
                    root1 = tmp0;
                } else {
                    break;
                }
            } else if (tmp1 != null && tmp0 != null) {
                //存在孩子0，1
                int tmp00 = Integer.parseInt("" + tmp0.getC());
                int tmp11 = Integer.parseInt("" + tmp1.getC());

                if ((tmp00 ^ numBit) > mBit) {
                    res += tmp0.getTime();
                }
                if ((tmp11 ^ numBit) > mBit) {
                    res += tmp1.getTime();
                }

                if ((tmp00 ^ numBit) == mBit) {
                    root1 = tmp0;
                } else if ((tmp11 ^ numBit) == mBit) {
                    root1 = tmp1;
                }
            } else {
                break;
            }
        }
        return res;
    }


    private class Node {
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

