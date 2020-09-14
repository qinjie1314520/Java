package com.example.demo.learn;

public class other {
    public static void main(String args[]){
        //基本数据类型比较值是否相同
//        System.out.println("1==1"+(1==1));
//        System.out.println("1.5==1.5"+(1.5==1.5));
//        System.out.println('c'=='c');
//
//        //包装类性之间比较引用地址是否相同
//        System.out.println(new Float(11) == new Float(11));
//        //基本类性的包装和自己相同类比较值
//        System.out.println(new Double(11).equals(new Double(11)));
//        //这种是直接返回false
//        System.out.println(new Double(11).equals(new Float(11)));

//        //string存在常量池
//        String s = "a";
//        //存放在常量池
//        String s1 = "ab";
//        //中方式存放在堆内存
//        String s2 = new String("ab");
//        System.out.println("s == s1:"+(s == s1));
//        System.out.println("s1 == s2:"+(s1 == s2));
//        System.out.println("s.equals(s1.replace(\"b\", \"\")):"+s.equals(s1.replace("b", "")));




//        for(int i = 0; i < 10; ++i){
//            System.out.println(i);
//        }

//        System.out.println(0.3f != 0.3f);
//        System.out.println(Integer.toBinaryString(1000));
//        System.out.println(Integer.toBinaryString(100000).length());
//        System.out.println(Integer.toBinaryString(10));
//        int a;
//        int b = 10;
//        System.out.println(a = b << 1);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("10 >>> 1: "+((-1) >>> 1));
//        System.out.println("10 >>> 2: "+(-10 >>> 2));
//        System.out.println("10 >>> 3: "+(-10 >>> 3));
//        System.out.println("10 >>> 4: "+(-10 >>> 4));

//        Scanner in = new Scanner(System.in);
//        int i = 0;
//        Integer ii = 0;
//        while((ii = in.nextInt()) != null){
//
//            i++;
//        }
//        System.out.println(i);




//        List<String> s = new ArrayList<>(10);
//
//        s.add("one");
//        s.add("one1");
//        s.add("one2");
//        s.add("one3");
//        s.add("one4");
//        s.add("one5");
//        s.add("one6");
//        for(int i = 0; i < 3; i++){
//            s.remove(i);
//        }
//        System.out.println(s);

//        final Integer a = 8;
//        System.out.println(a);
//        t(a);
//        System.out.println(a);
//
//        System.out.println(5&0);
//
//        String s = "您好！";
//        System.out.println(s.length());
//        System.out.println(s.charAt(0));

        System.out.println(new te().t);
    }
    public static void t(Integer a){
        a = 1;
    }

    static class te{
        public int t = 1;
    }
}
