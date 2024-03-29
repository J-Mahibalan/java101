package pjava;

import java.io.*;
import java.util.Scanner;
 
public class FileSearchh {
	public static void main(String[] argv) throws Exception
    {
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name of the directory");
       String path = sc.nextLine();
       System.out.println("File name");
       String filename = sc.nextLine();
       File file = new File(path);
       
       if(file.isDirectory());
       File []files=file.listFiles();
       for(File file1:files) {
    	   if(file1.isFile()&& file1.getName().equals(filename)) {
    		   System.out.println("File found");
    		   break;
    	   }
    	   else {
    		  System.out.println("File is not found");
    	   }
    	   sc.close();	       
       }
    }
}