package edu01;

import java.io.*;
import java.util.regex.*;

public class HittingRate {

	public static void main(String[] args) throws java.io.IOException {

		FileInputStream in = null;
		InputStreamReader reader = null;
		BufferedReader br = null;
		
		/*calculate*/
		
		try {
			in = new FileInputStream("baseball-2014.csv");
			reader = new InputStreamReader(in, "UTF-8");
			br = new BufferedReader(reader);
			
			String header = br.readLine();
			String line = null;
			
			while ((line = br.readLine()) != null) {
				String[] items = line.split(",");	//newしないで初期値を代入
				String league = items[0];
				String team = items[1];
				String result = items[7];
				
				Pattern p = Pattern.compile("四.*");
				Matcher m = p.matcher(result);
				if (m.find()) {
					System.out.println(league + team + result);
				}
				
			}
		} finally {
			if (br != null) {
				br.close();
			}
			if (reader != null) {
				reader.close();
			}
			if (in != null) {
				in.close();
			}
		}
	}

}
