package com.qp.reflect1;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Constructor;

// 通过配置创建对象
public class reflect_demo3 {
    public static void main(String[] args) throws InterruptedException {
        Hero h = getHero();
        h.magicAttack();
    }

    public static Hero getHero() {

        File f = new File("./hero.config");

        try (FileReader fr = new FileReader(f)) {
            String className = null;
            char[] all = new char[(int) f.length()];
            fr.read(all);
            className = new String(all);
            System.out.println(className);
            Class clazz=Class.forName(className);
            Constructor c= clazz.getConstructor();
            Hero h= (Hero) c.newInstance();
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
