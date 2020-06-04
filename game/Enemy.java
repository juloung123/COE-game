package game;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;

public class Enemy{
    private int x;
    private int y;
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
}