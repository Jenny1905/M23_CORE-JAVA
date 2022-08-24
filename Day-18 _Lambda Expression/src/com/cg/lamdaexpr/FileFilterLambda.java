package com.cg.lamdaexpr;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		//lamda expression for searching the file in given path of particular extension
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".mp4");
		File dir=new File("C:\\Users\\PC\\Documents\\M23-Recording\\Core Java");
		File contents[]=dir.listFiles(filter);
		//enhanced for loop
		/*if any particular extension file is open on your system then
		 you will get that file in two times
		with one file will in $ sign*/
		for(File i:contents)
		{
			System.out.println(i);
		}
	}

}
