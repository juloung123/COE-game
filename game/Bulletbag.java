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
        for(int i=0;i<e.size();i++){
            temp = e.get(i);
            temp.update();
            if(temp.positionx() > maingame.WIDTH){
                e.remove(i);
            }
            if(temp.collision()){
                e.remove(i);
            }
        }
    }
    public void addBullet(Bullet bullet){
        e.add(bullet);
    }
    public void removeBullet(Bullet bullet){
        e.remove(bullet);
    }
    public static LinkedList<Bullet> getBulletBounds(){
        return e;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_SPACE){
            addBullet(new Bullet(Player.positionX(),Player.positiony()));
        }
    }
}