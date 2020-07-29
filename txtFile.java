/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class txtFile {
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
    String fileName = "Documents://biodata.txt"; //nama file yang akan dibuka
    String line = null; //membaca baris dalam file
    
    FileReader fileReader = new FileReader(fileName);
    
    BufferedReader bufferedReader = new BufferedReader (fileReader);
    int hitungBaris = 0;
    while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            System.out.println(hitungBaris);
            if(hitungBaris == 0){
                System.out.println("");
            }
            hitungBaris++;
}
    bufferedReader.close();
    }
}


