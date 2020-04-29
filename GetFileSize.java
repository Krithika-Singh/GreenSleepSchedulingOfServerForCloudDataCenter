/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
import java.io.File;

public class GetFileSize {
        static double size;
        static int leng;
        static String csname;
	public static void getAllSizes(File file) {
		if (!file.exists() || !file.isFile()) return;

		System.out.println(getFileSizeBytes(file) + " bytes");
		System.out.println(getFileSizeKiloBytes(file) + " kilo bytes");
		System.out.println(getFileSizeMegaBytes(file) + " mega bytes");
	}

	public static double getFileSizeMegaBytes(File file) {
		return (double) file.length() / (1024 * 1024);
	}
	
	public static double getFileSizeKiloBytes(File file) {
		return (double) file.length() / 1024;
	}

	public static double getFileSizeBytes(File file) {
		return file.length();
	} 
        
        public static void setSize(double s) {
            size = s;
        }
        public static double getSize() {
            return size;
        }
        public static void setContent(int l) {
            leng = l;
        }
        public static int getContent() {
            return leng;
        }
        public static void setServer(String cs) {
            csname = cs;
        }
        public static String getServer() {
            return csname;
        }
}
