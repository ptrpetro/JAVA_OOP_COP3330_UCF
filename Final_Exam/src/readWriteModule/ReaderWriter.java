package readWriteModule;

import java.io.*;
import java.util.ArrayList;

import sorter.Person;

public class ReaderWriter {
	
	public static ArrayList<Person> readToList(String fname){
		ArrayList<Person> arr = new ArrayList<>();
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(fname));
			String line = null;
			while((line = br.readLine()) != null ) {
				arr.add(new Person(line));
			}
		br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public static void writeList(String fname, ArrayList<Person>arr) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		for(Person p:arr) {
			bw.write(p+"\n");
		}
		bw.close();
	}
}
