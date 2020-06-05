package game;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class graphic extends JPanel implements ActionListener{
    Timer loop;
    Player player;
    ControllEnemy c;
    Bulletbag k;
    public graphic(){
        loop = new Timer(10,this);
        loop.start();
        player = new Player(100,350);
        c = new ControllEnemy();
        k = new Bulletbag();
        addKeyListener(new KeyInput(player));
        addKeyListener(new Keyinput2(k));
        setFocusable(true);
    }
    //จัดการกราฟฟิกลงบนจอ
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, maingame.WIDTH, maingame.HIGHT);
        player.draw(g2d);
        c.draw(g2d);
        k.draw(g2d);
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Tahoma",Font.BOLD,30));
        g2d.drawString("Score :  "+Bulletbag.score,500, 20);
        g2d.drawString("Heart :  "+Player.HP,500, 60);
        if(Player.HP == 0){
            g2d.setColor(Color.WHITE);
            g2d.setFont(new Font("Tahoma",Font.BOLD,45));
            g2d.drawString("Game Over",500, 300);
            g2d.drawString("Press 'Space bar' to Restart",300, 400);
        }
    }
    public void actionPerformed(ActionEvent e){
        player.update();
        c.update();
        k.update();
        repaint();
    }
}