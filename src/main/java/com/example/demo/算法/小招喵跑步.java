package com.example.demo.算法;

import java.util.Scanner;
//题目描述：
//小招喵喜欢在数轴上跑来跑去，假设它现在站在点n处，它只会3种走法，分别是：
//1.数轴上向前走一步，即n=n+1;
//2.数轴上向后走一步，即n=n-1;
//3.数轴上使劲跳跃到当前点的两倍，即n=2*n
//现在小招喵在原点，即n=0，它想去点x处，快帮小招喵算算最快的走法需要多少步？
//输入描述：
//小招喵想去的位置x
//输出描述：
//小招喵最少需要的步数
//示例：
//输入：
//3
//输出：
//3
//————————————————
//版权声明：本文为CSDN博主「Violet-Zhao」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/Demodan/article/details/79888460
public class 小招喵跑步 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x >= 0){
            System.out.println(countSteps(x));
        }
    }
    public static int countSteps(int num){
        int res = 0;
        if(num <= 0){
            return res;
        }
        if(num%2==0){
            //偶数可除二
            res = res + 1 +countSteps(num / 2);
        }
        else if(num%2==1){
            //奇数减1
            res = res + 1 +countSteps(num -1);
        }
        return res;
    }
}
