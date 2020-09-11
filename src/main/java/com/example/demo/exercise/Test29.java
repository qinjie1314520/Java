package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
public class Test29 {
    public class Solution {
        public String PrintMinNumber(int[] numbers) {
            if (numbers.length == 0) {
                return "";
            }
            return Arrays.stream(numbers).mapToObj(x -> x + "").sorted((x, y) -> (x + y).compareTo(y + x)).reduce((x, y) -> x + y).get();
        }
    }

}
