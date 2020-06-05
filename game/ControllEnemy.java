package game;

import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
//บรรจุ Object Enemy
public class ControllEnemy{
    private static LinkedList<Enemy> e = new LinkedList<>();
    Enemy temp;
    public ControllEnemy(){
        addEnemy(new Enemy(150,150));
        addEnemy(new Enemy(150,200));
        addEnemy(new Enemy(150,250));
        addEnemy(new Enemy(150,300));
    }
    public void draw(Graphics2D g2d){
        for(int i = 0; i < e.size();i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    // ให้ตัวละครเคลื่อนที่หลายๆตัว
    public void update(){
        for(int i =0 ; i < e.size();i++){
            temp=e.get(i);
            temp.update();
        }
    }
    //เพิ่ม enemy
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    //ลบ enemy ออก
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    //ส่งข้อมูลขอบเขตของ Enemy ไป
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
}