package com.lee.tony.mymetalslug.comp;

import java.util.ArrayList;
import java.util.List;

/**
 * 由于屏幕上会出现多个怪物，因此需要额外定义一个管理类来专门负责管理怪物的随机产生、死亡等行为
 * Created by Tony on 2015/6/6.
 */
public class MonsterManager {

    /* */
    public static final List<Monster> dieMonstersList = new ArrayList<>();
    public static final List<Monster> monstersList = new ArrayList<>();

    /**
     * 随机生成并添加怪物的方法
     */
    public static void generateMoster(){
        if (monstersList.size()<3+Util.rand(3)){
            Monster monster = new Monster(1+Util.rand(3));
            monstersList.add(monster);
        }

    }

    /**
     * 更新怪物与子弹的坐标的方法
     * @param shift
     */
    public static void updatePosition(int shift){
        
    }
}
