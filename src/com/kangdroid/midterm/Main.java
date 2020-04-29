package com.kangdroid.midterm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	public static void main(String[] args) {
		JSONParser jsonParser = new JSONParser();
		FileReader fr = null;
		JSONObject jObject = null;
		JSONArray arrayInfo = null;
		Scanner sysin = new Scanner(System.in);
		try {
			fr = new FileReader("midterm.json");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			jObject = (JSONObject)jsonParser.parse(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		arrayInfo = (JSONArray) jObject.get("poem");
		// Since this state, Parsing is done.
		
		System.out.print("Enter the keyword you are looking for: ");
		String keyword = sysin.next();
		
		for (int i = 0; i < arrayInfo.size(); i++) {
			// Print out items first.
			JSONObject tmpObject = (JSONObject) arrayInfo.get(i);
			String tmpInfo = (String) tmpObject.get("item");
			// Find it.
			int tmpIndex = tmpInfo.indexOf(keyword);
			if (tmpIndex >= 0) {
				System.out.print("item " + i + ": ");
				System.out.println(tmpInfo);
			}
		}
	}
}
