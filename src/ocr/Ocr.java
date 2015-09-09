/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocr;
import java.io.*;
import net.sourceforge.tess4j.*;
/**
 *
 * @author pavelshering
 */
public class Ocr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    File imageFile = new File("/Users/pavelshering/Documents/GitHub/ocr/ocr/input.tif");
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping
    try {

        String result = instance.doOCR(imageFile);
        System.out.println(result);
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8")); 
        writer.write(result);
        writer.close();
    }
    catch (IOException | TesseractException e) {
        System.err.println(e.getMessage());
        }
    }

    

}
