package Readdata;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties pr;
		String path= "D:\\Shreya_code\\Eclipse_workspace\\NewDemo123\\dataFile.properties";
	    public ReadFile1() throws IOException {
	    	pr = new Properties();
	    	FileInputStream fn = new FileInputStream(path);
	    	pr.load(fn);
	    	
	    }
	}

}
