/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author User
 */
public class WavPlayer {
     public static AudioClip musik;
    
    public void mainMusik (String source) {
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.play();
    }
    public void stopMusik (String source){
        URL url = this.getClass().getResource(source);
        musik = Applet.newAudioClip(url);
        musik.stop();
    }
    public static void main(String[] args) {
        WavPlayer sik = new WavPlayer();
        sik.mainMusik("C:\\Users\\User\\Documents\\njajallagu.mp3");
    }
}
