package com.lee.tony.mymetalslug.comp;

import java.util.Random;

/**
 * Created by Tony on 2015/6/6.
 * 工具类，计算随机数的方法
 */
public class Util {

    public static Random random = new Random();

    //返回一个0~range的随机数
    public static int rand(int range){
        if (range==0){
            return 0;
        }
        return Math.abs(random.nextInt() % range);
    }
}
