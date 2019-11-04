package com.nt.computer;
import java.io.File;
public class ComputerSystem {
public static void main(String[] args) {
        try {
        	File f=new File("D:\\Computer\\System\\firoj.text");
        	System.out.println(f.getParentFile());
        	f.getParentFile().mkdirs();
        	f.createNewFile();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	}
}
