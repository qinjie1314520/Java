package com.example.demo.learn.HashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class put {
    public static String getRandomString(int length) { //length表示生成字符串的长度

        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String args[]) {

        HashMap<String, Integer> hashMap = new HashMap(64);
//        for (int i = 0; i < 6500; i++) {
//            int h;
//            String s;
//            int a = (h = (s = "as"+i).hashCode()) ^ (h >>> 16);
//            System.out.println(a);
//            hashMap.put(s, i);
//        }
        hashMap.put(null, 1);
        System.out.println("size:" + hashMap.size());
    }

    private static class t {
        public t[] tt;
        public int[] a;
    }

    public void test(int[] a) {
    }
}

//    static <K,V> TreeNode<K,V> balanceInsertion(TreeNode<K,V> root,
//                                                TreeNode<K,V> x) {
//        //x是新增的节点
//        //root标识根节点，整个红黑树的根节点
//        x.red = true;//默认红色
//
//        for (TreeNode<K,V> xp, xpp, xppl, xppr;;) {
//            //xp保存新增节点的父亲
//            //xpp保存新增节点的父亲的父亲，即xp的父亲
//            //xppl保存
//
//            //给xp保存新节点的父亲
//            if ((xp = x.parent) == null) {
//                x.red = false;
//                return x;
//            }
//            //让xpp保存xp的父亲
//            else if (!xp.red || (xpp = xp.parent) == null)
//                return root;
//            //xppl的保存xpp左孩子，如果xpp的左孩子和xp相等即xp新增节点是新增节点父亲的左孩子
//            if (xp == (xppl = xpp.left)) {
//                if ((xppr = xpp.right) != null && xppr.red) {
//                    xppr.red = false;
//                    xp.red = false;
//                    xpp.red = true;
//                    x = xpp;
//                }
//                else {
//                    if (x == xp.right) {
//                        root = rotateLeft(root, x = xp);
//                        xpp = (xp = x.parent) == null ? null : xp.parent;
//                    }
//                    if (xp != null) {
//                        xp.red = false;
//                        if (xpp != null) {
//                            xpp.red = true;
//                            root = rotateRight(root, xpp);
//                        }
//                    }
//                }
//            }
//            else {
//                if (xppl != null && xppl.red) {
//                    xppl.red = false;
//                    xp.red = false;
//                    xpp.red = true;
//                    x = xpp;
//                }
//                else {
//                    if (x == xp.left) {
//                        root = rotateRight(root, x = xp);
//                        xpp = (xp = x.parent) == null ? null : xp.parent;
//                    }
//                    if (xp != null) {
//                        xp.red = false;
//                        if (xpp != null) {
//                            xpp.red = true;
//                            root = rotateLeft(root, xpp);
//                        }
//                    }
//                }
//            }
//        }
//    }


