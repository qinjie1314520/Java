package com.example.demo.exercise;

import java.util.*;

//为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。牛牛的小伙伴太多了，于是他只好把这个任务交给了你。
//输入描述:
//每个输入包含一个测试用例。
//每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
//接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
//接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
//保证不存在两项工作的报酬相同。
//输出描述:
//对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
//示例1
//输入
//复制
//3 3
//1 100
//10 1000
//1000000000 1001
//9 10 1000000000
//输出
//复制
//100
//1000
//1001
public class Test2 {
    public static void main(String args[]){
       try{
           Scanner scanner = new Scanner(System.in);
           String[] firstLine = scanner.nextLine().split(" ");
           //总工作数
           Integer totalWorkNum = Integer.parseInt(firstLine[0]);
           //总人数
           Integer totalPersionNum = Integer.parseInt(firstLine[1]);
           //保存总的工作
           List<Work>work = new ArrayList<Work>(totalWorkNum);
           //循环添加报酬—工作
//           for(int i = 0; i < totalWorkNum; i++){
//               String tmp[] = scanner.nextLine().split(" ");
//               if(!tmp[0].equals("")&&!tmp[1].equals("")){
//                   work.add(new Work(Integer.parseInt(tmp[0]),  Integer.parseInt(tmp[1])));
//               }
//           }
           while(true){
               String tmp[] = scanner.nextLine().split(" ");
               if(!tmp[0].equals("")&&!tmp[1].equals("")){
                   work.add(new Work(Integer.parseInt(tmp[0]),  Integer.parseInt(tmp[1])));
               }
               if(work.size()==totalWorkNum){
                   break;
               }
           }

           //排序
           Collections.sort(work, new Comparator<Work>() {
               @Override
               public int compare(Work o1, Work o2) {
                   return o2.getSalary()-o1.getSalary();
               }
           });
           System.out.println(work.get(0).getSalary());
           //添加每个小伙伴的能力
           String[] persionAbilities = scanner.nextLine().split(" ");
           for(String per : persionAbilities){
               for(int i = 0; i < work.size(); i++){
                   if(Integer.parseInt(per) >= work.get(i).getAbility()){
                       System.out.println(work.get(i).getSalary());
                       break;
                   }
               }
           }
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    private static class Work{
        private int ability;
        private int salary;
        public Work(int ability, int salary){
            this.ability = ability;
            this.salary = salary;
        }
        public int getAbility() {
            return ability;
        }

        public int getSalary() {
            return salary;
        }
    }
}
