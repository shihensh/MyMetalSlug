package com.lee.tony.mymetalslug.comp;

import java.util.Random;

/**
 * Created by Tony on 2015/6/6.
 * �����࣬����������ķ���
 */
public class Util {

    public static Random random = new Random();

    //����һ��0~range�������
    public static int rand(int range){
        if (range==0){
            return 0;
        }
        return Math.abs(random.nextInt() % range);
    }
}
