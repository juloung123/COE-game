package game;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Enemy{
    private int x;
    private int y;
    private LinkedList<Bullet> e = Bulletbag.getBulletBounds(); 
    private int speedx=5;
    public Enemy(int x,int y){
        this.x = x;
        this.y = y;
    }
    //วาดภาพตัวร้าย
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.fillRect(x,y,32,32);
        
    }
    public void update(){
        x+=speedx;
        if(x > maingame.WIDTH-50){
            speedx=-5;
        }
        if(x < 0){
            speedx=5;
        }
    }
    public void collision(){
        for(int i=0;i<e.size();i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                e.remove(i);
            }
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
}