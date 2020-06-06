package game;
//ออกแบบ Player

import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Player{
    private static int x;
    private static int y;
    //กำหนดความเร็วการเคลื่อนไหว
    private int speedx = 0 ;
    private int speedy = 0 ;
    public static int HP = 3;
    private LinkedList<Enemy> e = ControllEnemy.getEnemyBounds(); 
    public Player(int x,int y){
        this.x = x;
        this.y = y;
    }
    //method จัดการการเคลื่อนที่ของผู้เล่น
    public void update(){
        if(HP != 0){
            x += speedx;
            y += speedy;
            //การชนขอบออกจากจอ
            if(x<0){
                x = 0;
            }
            if(y<0){
                y= 0;
            }
            if(x > 1230){
                x = 1230;
            }
            if(y > 650){
                y = 650;
            }
            collision();
        }
    }
    //method ไว้วาดตัวละคร
    public void draw(Graphics2D g2d){
        g2d.setColor(Color.blue);
        g2d.fillRect(x+32,y+11,20,10);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(x, y,32,32);
    }
    //กดปุ่มค้างไว้
    public void keyPressed(KeyEvent e){
        int key= e.getKeyCode();
        if(key == KeyEvent.VK_A){
            speedx = -5;
        }
        if(key == KeyEvent.VK_D){
            speedx = 5;
        }
        if(key == KeyEvent.VK_W){
            speedy = -5;
        }
        if(key == KeyEvent.VK_S){
            speedy = 5;
        }
        if(key == KeyEvent.VK_SPACE && HP == 0)
        {
            HP = 3;
            Bulletbag.score = 0;
            Bulletbag.upscore = 0;
            x = 100;
            y = 350;
            ControllEnemy.restart();
            Bulletbag.restart();
        }
    }
    //ปล่อยปุ่ม
    public void keyReleased(KeyEvent e){
        int key= e.getKeyCode();
        if(key == KeyEvent.VK_A){
            speedx = 0;
        }
        if(key == KeyEvent.VK_D){
            speedx = 0;
        }
        if(key == KeyEvent.VK_W){
            speedy = 0;
        }
        if(key == KeyEvent.VK_S){
            speedy = 0;
        }
    }
    public Rectangle getBounds(){
        return new Rectangle(x,y,32,32);
    }
    //เช็คการชนของ Player กับ enemy
    public void collision(){
        for(int i=0;i<e.size();i++){
            if(getBounds().intersects(e.get(i).getBounds())){
                e.remove(i);
                --HP;
            }
        }
    }
    //ส่งตำแหน่งปัจจุบันของ Player
    public static int positionX(){
        return x;
    }
    public static int positiony(){
        return y;
    }
    public static void hpup(){
        HP++;
    }
    public void endgame(){
        if(HP == 0){
            speedx =0;
            speedy =0;
        }
    }
}