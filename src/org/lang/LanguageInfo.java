package org.lang;

import java.io.File;

public class LanguageInfo {
public static void main(String[] args) {
File f = new File("C:\\Users\\Sudha_Kumar\\Desktop\\New folder\\FileOperation");
boolean b = f.mkdir();
System.out.println(b);

boolean d = f.isDirectory();
System.out.println(d);


}
}