package com.lee.tony.mymetalslug.comp;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Tony on 2015/6/6.
 * 怪物类
 */
public class Monster {


    //定义怪物的类型的常量，即：有那几种怪物
    public static final int TYPE_BOMB = 1; //炸弹
    public static final int TYPE_FLY = 2; //飞行的敌人
    public static final int TYPE_MAN = 3; //普通的敌人

    //定义怪物类型的成员变量
    private  int type = TYPE_BOMB;
    //坐标
    private int x = 0;
    private int y = 0;

    //是否死亡
    private  boolean isDie = false;

    /**
     * 构造器，传入类型参数
     * @param type
     */
    public Monster(int type){
        this.type = type;

        //如果怪物是炸弹或不会飞的敌人，则Y坐标与玩家一样
        if (type==TYPE_BOMB || type == TYPE_MAN){


        }else if (type == TYPE_FLY){
            //如果是会飞的，根据屏幕高度随机生成怪物的Y坐标

        }
        //随机计算x坐标
        //x=...
    }


    /**
     * 绘制怪物的方法
     * @param canvas
     */
    public void draw(Canvas canvas){
        if (canvas==null){
            return;
        }
        switch (type){
            case TYPE_BOMB:

                break;
            case TYPE_FLY:

                break;
            case TYPE_MAN:

                break;
            default:
                break;
        }

    }

    /**
     * 根据怪物的动画帧图片来绘制怪物动画
     * @param canvas
     * @param bitmapArr
     */
     public void drawAni(Canvas canvas, Bitmap[] bitmapArr){

     }

    /**
     * 判断是否被打中
     * @param x
     * @param y
     * @return
     */
    public boolean isHurt(int x,int y){
        return true;
    }

    /**
     * 根据怪物类型判断怪物所发子弹类型
     * @return
     */
    public int getBulletType(){
        return 0;
    }

    /**
     * 发子弹的方法
     */
    public void addBullet(){

    }



}
