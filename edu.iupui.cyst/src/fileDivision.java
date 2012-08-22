import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class fileDivision {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File Inputfile= new File ("D:/PhDcourses/Regenstrief_Projects/Pancreatic_cyst/REX_Stuff/jeff_949_all.txt");
		File Inputfile= new File ("D:/PhDcourses/Regenstrief_Projects/Pancreatic_cyst/REX_Stuff/jeff_949_all.txt");
		FileInputStream fstream=new FileInputStream (Inputfile); 
		DataInputStream in=new DataInputStream(fstream);
		BufferedReader br= new BufferedReader (new InputStreamReader(in));
		String line=null;
//		while ((line=br.readLine())!=null){
//			System.out.print(line+"\n");
//		}
//		}
		int i=1;
		while ((line=br.readLine())!=null){
		FileWriter outputfile = new FileWriter ("D:/PhDcourses/Regenstrief_Projects/Pancreatic_cyst/REX_Stuff/corpus/"+ Integer.toString(i) + ".txt" , true);
		BufferedWriter out= new BufferedWriter(outputfile);
		out.append(line+"\n");
		out.close();
		if (String.valueOf(line).contains("ZORROZORRO"))  {i++;}
				}
			}

}
