package com.example.demo.exercise;

import java.util.*;

public class Test11 {
    public static void main(String args[]){
        try{

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            Set<Integer> set = new TreeSet<Integer>(((o1, o2)->(o1-o2)));
            for(int i = 0; i < n+m; i++){
                set.add(in.nextInt());
            }
            StringBuilder res = new StringBuilder();
            Iterator it = set.iterator();
            while(it.hasNext()){
                res.append(it.next()+" ");
            }
            System.out.println(res.toString().trim());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
