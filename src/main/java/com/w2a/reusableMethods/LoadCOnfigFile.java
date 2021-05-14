package com.w2a.reusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class LoadCOnfigFile {
	
	String fileLocation;
	Properties prop=new Properties();
	
	public void loadFile(String fileLocation) {
		this.fileLocation=fileLocation;
		try {
			FileInputStream file=new FileInputStream(fileLocation);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
