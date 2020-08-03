/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author User
 */
public class MP3Play {
    public static void main(String[] args) throws JavaLayerException {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Documents\\njajallagu");
            Player player = new Player(fileInputStream);
            System.out.println("Song is Playing...");
            
            player.play();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (JavaLayerException e){
            e.printStackTrace();
            
        }
    }
    
}
