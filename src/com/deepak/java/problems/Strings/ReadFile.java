package com.deepak.java.problems.Strings;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		String fileName = "/Users/Deepak/Documents/Splunk_Queries.txt";
		Scanner sc = null;
		try {
			File file = new File(fileName);
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
