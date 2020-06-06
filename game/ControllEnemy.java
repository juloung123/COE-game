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
        addEnemy(new Enemy(1230,0));
        addEnemy(new Enemy(1230,50));
        addEnemy(new Enemy(1230,100));
        addEnemy(new Enemy(1230,150));
        addEnemy(new Enemy(1230,200));
        addEnemy(new Enemy(1230,250));
        addEnemy(new Enemy(1230,300));
        addEnemy(new Enemy(1230,350));
        addEnemy(new Enemy(1230,400));
        addEnemy(new Enemy(1230,450));
        addEnemy(new Enemy(1230,500));
        addEnemy(new Enemy(1230,550));
        addEnemy(new Enemy(1230,600));
        addEnemy(new Enemy(1230,650));
        addEnemy(new Enemy(1230,700));
        addEnemy(new Enemy(1230,750));
        addEnemy(new Enemy(1230,800));
    }
    public void draw(Graphics2D g2d){
        for(int i = 0; i < e.size();i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    // ให้ตัวละครเคลื่อนที่หลายๆตัว
    public void update(){
        if(Player.HP != 0){
            for(int i =0 ; i < e.size();i++){
                temp=e.get(i);
                temp.update();
                if(temp.positionx()<0){
                    e.remove(i);
                }
            }
            randomenemy();
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
    //รูปแบบการสุ่ม enemy ขึ้นมา
    public void randomenemy(){
        int a = (int)(Math.random()*200);
        int rana = (int)(Math.random()*200);
        int b = (int)(Math.random()*200 + 200);
        int ranb = (int)(Math.random()*200);
        int c = (int)(Math.random()*200 + 400);
        int ranc = (int)(Math.random()*200);
        if(rana == 1){
            addEnemy(new Enemy(1230,a));
        }
        if(ranb == 1){
            addEnemy(new Enemy(1230,b));
        }
        if(ranc == 1){
            addEnemy(new Enemy(1230,c));
        }
        if(rana == 2){
            anotherenemy();
        }    
    }
    //restart โดยการลบ enemy ทั้งหมด
    public static void restart(){
        for(int i = 0;i<e.size();i++){
            e.remove(i);
        }
    }
    //รูปแบบของ enemy
    public void anotherenemy(){
        int a = (int)(Math.random()*13);
        if(a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,0));
        }
        if(a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,32));
        }
        if(a == 0 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,64));
        }
        if(a == 0 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,96));
        }
        if(a == 0 ||a == 1 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,128));
        }
        if(a == 0 ||a == 1 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,160));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,192));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,224));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,256));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,288));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,320));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,352));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,384));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,416));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,448));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 || a == 8 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,480));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,512));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 9 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,544));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,576));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 10 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,608));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,640));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 11 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,672));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,704));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 12 || a == 13){
            addEnemy(new Enemy(1230,736));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 ||a == 13){
            addEnemy(new Enemy(1230,768));
        }
        if(a == 0 ||a == 1 || a == 2 ||a == 3 ||a == 4 ||a == 5 ||a == 6 ||a == 7 || a == 8 || a == 9 || a == 10 || a == 11 ||a == 13){
            addEnemy(new Enemy(1230,800));
        }
    }
}