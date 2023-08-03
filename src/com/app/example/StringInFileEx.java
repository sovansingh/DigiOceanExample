package com.app.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringInFileEx {

	public static boolean findStringInFile(String filePath,String str)throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String line = scanner.next();
			System.out.println(line);
			if(line.contains(str)) {
				scanner.close();
				return true;
			}
		}
		scanner.close();
		return false;
	}
	public static void main(String[] args) {
		String str = "Java";
		String filePath = "c://testFile.txt";
		boolean result = false;
		try {
			result = findStringInFile(filePath,str);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(result);
	}
}
