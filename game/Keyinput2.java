package game;

import java.awt.event.*;

public class Keyinput2 extends KeyAdapter{
    Bulletbag p;
    public Keyinput2(Bulletbag p){
        this.p = p;
    }
    //กดปุ่มค้าง
    public void keyPressed(KeyEvent e){
        p.keyPressed(e);
    }
}