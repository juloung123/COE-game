package game;

import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
//บรรจุ Object Enemy
public class ControllEnemy{
    LinkedList<Enemy> e = new LinkedList<>();
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
    public void addEnemy(Enemy enemy){
        e.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
}