/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractorz;

public class ReadDoc {
    public static void main(String[] args) {
        // TODO code application logic here
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(prop);
        
        File filenya = new File("F://readDoc.doc");
        WordExtractor extractor = null;
        try {
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();
            System.out.println(fileText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
