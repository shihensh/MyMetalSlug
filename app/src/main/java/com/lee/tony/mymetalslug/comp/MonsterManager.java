package com.lee.tony.mymetalslug.comp;

import java.util.ArrayList;
import java.util.List;

/**
 * ������Ļ�ϻ���ֶ����������Ҫ���ⶨ��һ����������ר�Ÿ���������������������������Ϊ
 * Created by Tony on 2015/6/6.
 */
public class MonsterManager {

    /* */
    public static final List<Monster> dieMonstersList = new ArrayList<>();
    public static final List<Monster> monstersList = new ArrayList<>();

    /**
     * ������ɲ���ӹ���ķ���
     */
    public static void generateMoster(){
        if (monstersList.size()<3+Util.rand(3)){
            Monster monster = new Monster(1+Util.rand(3));
            monstersList.add(monster);
        }

    }

    /**
     * ���¹������ӵ�������ķ���
     * @param shift
     */
    public static void updatePosition(int shift){
        
    }
}
