package com.lee.tony.mymetalslug.comp;

import android.graphics.Bitmap;

/**
 * 子弹类
 * Created by Tony on 2015/6/6.
 */
public class Bullet {

    /*定义子弹类型的常量*/
    public static final int BULLET_TYPE_1 = 1;
    public static final int BULLET_TYPE_2 = 2;
    public static final int BULLET_TYPE_3 = 3;
    public static final int BULLET_TYPE_4 = 4;

    /*定义子弹类型*/
    private int bulletType ;
    /*子弹坐标*/
    private int x;
    private int y;
    /*子弹射击方向*/
    private int dir;


    /**
     * 根据子弹类型获取子弹对应的图片
     * @return
     */
    public Bitmap getBitmap(){
        switch (bulletType){
            case BULLET_TYPE_1:
                return null;
            case BULLET_TYPE_2:
                return null;
            case BULLET_TYPE_3:
                return null;
            case BULLET_TYPE_4:
                return null;
            default:
                return null;
        }
    }

    /**
     * 控制子弹移动的方法
     */
    public void move(){

    }
}
