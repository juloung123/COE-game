package game;

import javax.swing.*;

public class maingame {
    //สร้างหน้าจอ
    public static final int WIDTH = 1280;
    public static final int HIGHT = 720;
    public static void main(String[] args){
        //String filepath = "C:/Users/BlazeR/Desktop/project/game/Kimi no Sweet Pussy.wav";
        String filepath = "Kimi no Sweet Pussy.wav";
        music musicObject = new music();
        musicObject.song(filepath);

        JFrame window = new JFrame("COE PSU GAME");
        window.setSize(WIDTH,HIGHT);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new graphic());
        window.setVisible(true);
    }
}