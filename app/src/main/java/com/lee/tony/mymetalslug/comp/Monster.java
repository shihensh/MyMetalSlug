package com.lee.tony.mymetalslug.comp;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Tony on 2015/6/6.
 * ������
 */
public class Monster {


    //�����������͵ĳ������������Ǽ��ֹ���
    public static final int TYPE_BOMB = 1; //ը��
    public static final int TYPE_FLY = 2; //���еĵ���
    public static final int TYPE_MAN = 3; //��ͨ�ĵ���

    //����������͵ĳ�Ա����
    private  int type = TYPE_BOMB;
    //����
    private int x = 0;
    private int y = 0;

    //�Ƿ�����
    private  boolean isDie = false;

    /**
     * ���������������Ͳ���
     * @param type
     */
    public Monster(int type){
        this.type = type;

        //���������ը���򲻻�ɵĵ��ˣ���Y���������һ��
        if (type==TYPE_BOMB || type == TYPE_MAN){


        }else if (type == TYPE_FLY){
            //����ǻ�ɵģ�������Ļ�߶�������ɹ����Y����

        }
        //�������x����
        //x=...
    }


    /**
     * ���ƹ���ķ���
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
     * ���ݹ���Ķ���֡ͼƬ�����ƹ��ﶯ��
     * @param canvas
     * @param bitmapArr
     */
     public void drawAni(Canvas canvas, Bitmap[] bitmapArr){

     }

    /**
     * �ж��Ƿ񱻴���
     * @param x
     * @param y
     * @return
     */
    public boolean isHurt(int x,int y){
        return true;
    }

    /**
     * ���ݹ��������жϹ��������ӵ�����
     * @return
     */
    public int getBulletType(){
        return 0;
    }

    /**
     * ���ӵ��ķ���
     */
    public void addBullet(){

    }



}
