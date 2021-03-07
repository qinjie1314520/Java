package com.example.demo.算法;

import java.util.*;

public class 火星文字典 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        build(scanner.nextLine().split(" "));
        to();
        if(res.size() == sets.size()){
            for(char c : res){
                System.out.print(c);
            }
        }else{
            System.out.println("invalid");
        }
    }

    static int[][] map = new int[26][26];
    static boolean[] flag = new boolean[26];
    static Set<Character> sets = new HashSet<>();
    static List<Character> res = new ArrayList<>();
    static int degree[] = new int[26];

    static void to(){
        while(res.size() < sets.size()){
            //找到节点度数为0的，如果个数超过一个就不行
            int cn = 0;
            for(int i = 0 ; i < degree.length; i++){
                if(degree[i]==0 && flag[i]){
                    cn++;
                }
            }
            if(cn!=1){
                break;
            }

            for(int i = 0; i < degree.length ; i++){
                if(degree[i]==0 && flag[i]){
                    res.add((char)('a'+i));
                    flag[i] = false;
                    //删除度数
                    for(int j = 0; j < map[i].length; j++){
                        if(map[i][j]==1){
                            degree[j]--;
                        }
                        map[i][j]=0;
                    }
                }
            }
        }
    }

    public static void build(String strs[]){
        String pre = strs[0];

        for(char c : pre.toCharArray()){
            sets.add(c);
        }

        for(int i = 1; i < strs.length; i++){
            String cur = strs[i];
            for(char c : cur.toCharArray()){
                sets.add(c);
            }

            for(int j = 0 ; j < Math.min(pre.length(),cur.length()); j++){
                if(pre.charAt(j) == cur.charAt(j)){
                    continue;
                }

                if(map[pre.charAt(j)-'a'][cur.charAt(j)-'a']==1){
                    break;
                }
                map[pre.charAt(j)-'a'][cur.charAt(j)-'a']=1;
                flag[pre.charAt(j)-'a']=true;
                flag[cur.charAt(j)-'a']=true;
                degree[cur.charAt(j)-'a']+=1;
                break;
            }
            pre = cur;

        }

    }
}
