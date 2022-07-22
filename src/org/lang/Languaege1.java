package org.lang;

import java.io.File;
import java.io.IOException;

public class Languaege1 {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Sudha_Kumar\\Desktop\\New folder\\FileOperation\\Folder");
	boolean a = f.mkdirs();
	System.out.println(a);
	File f2 = new File("C:\\Users\\Sudha_Kumar\\Desktop\\New folder\\FileOperation\\Folder\\File.txt");
 boolean b = f2.createNewFile();
 System.out.println(b);
	//check weather file can be readable or not
boolean b1 = f2.canWrite();
System.out.println(b1);
boolean b2 = f2.canRead();
System.out.println(b2);
boolean b3 = f2.canExecute();
System.out.println(b3);
System.out.println("sudha");
System.out.println("kumar");
System.out.println("1");
System.out.println("2");
System.out.println("bharath");
System.out.println("kumar");
System.out.println("banu");
System.out.println("divya");
System.out.println("priya");

}
}
