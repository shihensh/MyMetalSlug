package com.lee.tony.mymetalslug.comp;

import android.graphics.Bitmap;

/**
 * �ӵ���
 * Created by Tony on 2015/6/6.
 */
public class Bullet {

    /*�����ӵ����͵ĳ���*/
    public static final int BULLET_TYPE_1 = 1;
    public static final int BULLET_TYPE_2 = 2;
    public static final int BULLET_TYPE_3 = 3;
    public static final int BULLET_TYPE_4 = 4;

    /*�����ӵ�����*/
    private int bulletType ;
    /*�ӵ�����*/
    private int x;
    private int y;
    /*�ӵ��������*/
    private int dir;


    /**
     * �����ӵ����ͻ�ȡ�ӵ���Ӧ��ͼƬ
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
     * �����ӵ��ƶ��ķ���
     */
    public void move(){

    }
}
