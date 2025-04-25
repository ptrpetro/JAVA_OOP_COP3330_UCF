package sorter;
import java.util.Collections;
import java.util.ArrayList;
import readWriteModule.ReaderWriter;

public class Processor {
	
	public static void main(String[] args) {
		// read data txt inside ArrayList of Persons
		ArrayList<Person> arr = ReaderWriter.readToList("data.txt");
		Collections.sort(arr); // sort & print ArrayList
		// create prcoessed txt
		try {
			ReaderWriter.writeList("processed.txt", arr);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
