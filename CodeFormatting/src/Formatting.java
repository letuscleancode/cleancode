import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class Formatting {

	private class UnFormattedCode {

		 public List<String> readFile() throws IOException {try(BufferedReader br = new BufferedReader(new FileReader("original.txt"))){
		            List<String> listOfData = new ArrayList()<>();String d;
		            while((d = br.readLine()) != null){
		            listOfData.add(d);            }
		            return listOfData;
		        }
		    }

		    public static void writeFile(List<String> listOfData) throws IOException{
		        try(BufferedWriter bw = new BufferedWriter(new FileWriter("numbers.txt"))){
		            for(String str: listOfData){
		                bw.write(str);bw.newLine();            }
		        }
		    }
		    public  void main() throws IOException {
		        List<String> data = readFile(); writeFile(data);
		    }

	}
