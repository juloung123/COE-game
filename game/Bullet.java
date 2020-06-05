package game;

//ออกแบบกระสุน

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Bullet{
    private int x ;
    private int y ;
    private LinkedList<Enemy> e = ControllEnemy.getEnemyBounds(); 
    //กำหนดความเร็วการเคลื่อนไหว
    private int speedx = 5 ;
    public Bullet(int x,int y){
        this.x = x ;
        this.y = y ;
    }
    public void update(){
        x+=speedx;
    }
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.RED);
        g2d.fillRect(x+32,y+11,20,10);
    }
    public Rectangle getBounds(){
        return new Rectangle(x+32,y+11,20,10);
    }
    public boolean collision(){
        for(int i=0;i<e.size();i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                e.remove(i);
                return true;
            }
        }
        return false;
    }
    public int positionx(){
        return x;
    }
    public int positiony(){
        return y;
    }
    public void endgame(){
        speedx = 0;
    }
}