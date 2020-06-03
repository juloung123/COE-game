package game;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;

public class graphic extends JPanel implements ActionListener{
    Timer loop;
    Player player;
    public graphic(){
        loop = new Timer(10,this);
        loop.start();
        player = new Player(100,100);
        addKeyListener(new KeyInput(player));
        setFocusable(true);
    }
    //จัดการกราฟฟิกลงบนจอ
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, maingame.WIDTH, maingame.HIGHT);
        player.draw(g2d);
    }
    public void actionPerformed(ActionEvent e){
        player.update();
        repaint();
    }
}