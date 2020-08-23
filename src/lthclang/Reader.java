package lthclang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader 
{
	private File f = new File("prgm.txt");
	List<String> prgm = new ArrayList<String>();
	
	public Reader(){prgmReader();}
	
	public void prgmReader()
	{
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null)
			{
				prgm.add(str);
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println("IOException caused a fail");
		}
	}

	public List<String> getPrgm() {return prgm;}
}
