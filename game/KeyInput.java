package game;

import java.awt.event.*;

public class KeyInput extends KeyAdapter{
    Player p;
    public KeyInput(Player p){
        this.p = p ;
    }
    //กดปุ่มค้าง
    public void keyPressed(KeyEvent e){
        p.keyPressed(e);
    }
    //ปล่อยปุ่ม
    public void keyReleased(KeyEvent e){
        p.keyReleased(e);;
    }
}