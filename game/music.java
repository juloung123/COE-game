package game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import java.io.*;

public class music{
    public void song(String musicLocation){
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();

                //JOptionPane.showMessageDialog(null,"Press ok to stop playing");
            }
            else{
                System.out.println("Can't find file");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}