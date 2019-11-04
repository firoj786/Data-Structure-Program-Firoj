package com.firoj.java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ReadFile {
public static void main(String[] args) throws IOException {
		/* FileReader fr = new FileReader("D:\\test.txt");
		  int i=fr.read(); 
		  while(i!=-1) { 
		 System.out.print((char)i); //only one line read
		 i= fr.read();
		  }
		  }
		  }
		 */
	BufferedReader br = new BufferedReader(new FileReader("D:\\test.txt"));
  String str = br.readLine();
   while(str !=null) {
	   System.out.println(str);//one se jada line read
	   str = br.readLine();
   }
}
}
