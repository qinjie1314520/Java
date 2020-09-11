package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.*;

public class Test13 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
            String str[] = in.nextLine().split(" ");
            try{
                Integer cnt = new Integer(str[1]);
                IdAndNum [] mins = new IdAndNum[cnt];
                char c[] = str[0].toCharArray();
                List<Integer> totalNum = new ArrayList<>(c.length);
                for(int i = 0 ; i < c.length; i++){
                    Integer cc = new Integer(""+c[i]);
                    totalNum.add(cc);
                    if(i < cnt){
                        IdAndNum idAndNum = new IdAndNum();
                        idAndNum.setI(i);
                        idAndNum.setNum(cc);
                        mins[i] = idAndNum;
                        Arrays.sort(mins, new Comparator<IdAndNum>() {
                            @Override
                            public int compare(IdAndNum o1, IdAndNum o2) {
                                return o1.getNum()-o2.getNum();
                            }
                        });
                    }else{
                        for(int j = cnt-1; j >=0; j--){
                            if(mins[j].getNum() > cc){
                                mins[j].setI(i);
                                mins[j].setNum(cc);
                                break;
                            }
                        }
                    }
                }
                for(IdAndNum idAndNum : mins){
                    totalNum.remove(idAndNum.getI());
                }
                for(int i = 0; i < totalNum.size(); i++){
                    System.out.print(totalNum.get(i));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    public BigInteger reduce(BigInteger big){

        return null;
    }

    public static class IdAndNum{
        private int i;
        private int num;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
