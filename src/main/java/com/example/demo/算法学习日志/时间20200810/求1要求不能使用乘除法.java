package com.example.demo.算法学习日志.时间20200810;
//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
public class 求1要求不能使用乘除法     {

        public int Sum_Solution(int n) {
            int an = n;
            boolean b = ((n-1)>0) && ((an+=Sum_Solution(n-1)) >0);
            return an;
        }
}
