package game;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.*;
import javax.sound.sampled.FloatControl;

//ใส่เพลงที่ต้องการ
public class music{
    public void song(String musicLocation){
        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists()){
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                FloatControl control = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                control.setValue(20f * (float) Math.log10(0.15));
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
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