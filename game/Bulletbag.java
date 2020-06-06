package game;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

//บรรจุ Object bullet
//เช็คว่าชนกับ Enemy หรือเปล่า ถ้าชนจะลบออกทั้งคู่
public class Bulletbag{
    private static LinkedList<Bullet> e = new LinkedList<>();
    public static int score = 0; 
    public static int upscore = 0;
    Bullet temp;
    public Bulletbag(){
    }
    public void draw(Graphics2D g2d){
        for(int i=0;i<e.size();i++){
            temp = e.get(i);
            temp.draw(g2d);
        }
    }
    public void update(){
        if(Player.HP != 0){
            for(int i=0;i<e.size();i++){
                temp = e.get(i);
                temp.update();
                if(temp.positionx() > maingame.WIDTH){
                    e.remove(i);
                }
                if(temp.collision()){
                    e.remove(i);
                    score++;
                    upscore++;
                }
            }
            if(upscore == 100){
                upscore = 0;
                Player.hpup();
            }
        }
    }
    //แอดกระสุนเข้า Linkedlist
    public void addBullet(Bullet bullet){
        if(checkbullet() && Player.HP != 0){
            e.add(bullet);
        }
    }
    //ลบกระสุนออกจาก Linkedlist
    public void removeBullet(Bullet bullet){
        e.remove(bullet);
    }
    //ส่งข้อมูลขอบเขตของ Bullet ไป
    public static LinkedList<Bullet> getBulletBounds(){
        return e;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE){
            addBullet(new Bullet(Player.positionX(),Player.positiony()));
        }
    }
    //restart เกมโดยการลบกระสุนออกทั้งหมด
    public static void restart(){
        for(int i = 0;i<e.size();i++){
            e.remove(i);
        }
    }
    //เช็คกระสุนไม่ให้เกิน 10 ลูก ใส่ใน addbullet 
    public boolean checkbullet(){
        int check = 0 ;
        for(int i = 0;i<e.size();i++){
            ++check;
        }
        if(check <= 10){
            return true;
        }
        return false;
    }
}