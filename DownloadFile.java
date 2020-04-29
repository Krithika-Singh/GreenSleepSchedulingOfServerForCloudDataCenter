/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DownloadFile {
    //https://www.tutorialspoint.com/javaexamples/file_copy.htm
	public static void downloadFile(String inputPath, String outputPath) throws IOException {
            FileInputStream ins = null;
            FileOutputStream outs = null;
            try {
                File infile = new File(inputPath);
                File outfile = new File(outputPath);
                ins = new FileInputStream(infile);
                outs = new FileOutputStream(outfile);
                byte[] buffer = new byte[1024];
                int length;
         
                while ((length = ins.read(buffer)) > 0) {
                    outs.write(buffer, 0, length);
                } 
                ins.close();
                outs.close();
                System.out.println("File copied successfully!!");
            } catch(IOException ioe) {
                ioe.printStackTrace();
            } 
        }
}