import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		int i=1;
//		String line="this is just a test";
//		FileWriter outputfile = new FileWriter ("D:/PhDcourses/Regenstrief_Projects/Pancreatic_cyst/REX_Stuff/corpus2/"+ Integer.toString(i) + ".txt");
//		BufferedWriter out= new BufferedWriter (outputfile);
//		out.write(line);
//		out.close();
		File Inputfile= new File ("D:/PhDcourses/Regenstrief_Projects/Pancreatic_cyst/REX_Stuff/jeff_949_all.txt");
		FileInputStream fstream=new FileInputStream (Inputfile); 
		DataInputStream in=new DataInputStream(fstream);
		BufferedReader br= new BufferedReader (new InputStreamReader(in));
		String line=null;
		while ((line=br.readLine())!=null){
		line=br.readLine();//System.out.print(line+"\n");
		if (String.valueOf(line).contains("ZORROZORRO")) {System.out.print(line+"\n");}}
		
	}

}
