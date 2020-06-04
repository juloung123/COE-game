package game;
//ออกแบบ Player
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;

public class Player{
    private int x;
    private int y;
    //กำหนดความเร็วการเคลื่อนไหว
    private int speedx = 0 ;
    private int speedy = 0 ;
    public Player(int x,int y){
        this.x = x;
        this.y = y;
    }
    //method จัดการการเคลื่อนที่ของผู้เล่น
    public void update(){
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
    }
    //method ไว้วาดตัวละคร
    public void draw(Graphics2D g2d){
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
}