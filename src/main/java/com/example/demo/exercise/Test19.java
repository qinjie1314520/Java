package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 头条的2017校招开始了！为了这次校招，我们组织了一个规模宏大的出题团队，每个出题人都出了一些有趣的题目，
 * 而我们现在想把这些题目组合成若干场考试出来，在选题之前，我们对题目进行了盲审，并定出了每道题的难度系统。
 * 一场考试包含3道开放性题目，假设他们的难度从小到大分别为a,b,c，我们希望这3道题能满足下列条件：
 * a<=b<=c
 * b-a<=10
 * c-b<=10
 * 所有出题人一共出了n道开放性题目。现在我们想把这n道题分布到若干场考试中（1场或多场，每道题都必须使用且只能用一次），
 * 然而由于上述条件的限制，可能有一些考试没法凑够3道题，因此出题人就需要多出一些适当难度的题目来让每场考试都达到要求，
 * 然而我们出题已经出得很累了，你能计算出我们最少还需要再出几道题吗？
 */
public class Test19 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            List<Integer> nums = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                nums.add(in.nextInt());
            }
            Collections.sort(nums);
            //保存结果
            int res = 0;
            for (int i = 0; i < nums.size(); i++) {
                int a = nums.get(i);
                if (i + 1 >= nums.size()) {
                    res += 2;
                } else if (i + 2 >= nums.size()) {
                    res += 1;
                    i++;
                } else {
                    int b = nums.get(i + 1);
                    int c = nums.get(i + 2);
                    if ((b - a) > 10) {
                        //不满足第二个条件
                        res += 2;
                    } else if (c - b > 10) {
                        res += 1;
                        i++;
                    } else {
                        i += 2;
                    }
                }
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
