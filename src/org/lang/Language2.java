package org.lang;

import java.io.File;

public class Language2 {
public static void main(String[] args) {
	File f = new File("C:\\Users\\Sudha_Kumar\\Desktop");
	String[]li=f.list();
	for(String x:li) {
		System.out.println(x);
	}
}
}
