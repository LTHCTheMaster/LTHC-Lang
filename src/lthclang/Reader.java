package lthclang;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Reader 
{
	private String path = JOptionPane.showInputDialog("Program file path");
	private File f = new File(path);
	List<String> prgm = new ArrayList<String>();
	
	public Reader(){prgmReader();}
	
	public void prgmReader()
	{
		String txtCheck = f.getName().split(".lthclang")[0];
		if(f.getName().equalsIgnoreCase(txtCheck + ".lthclang"))
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
		else
		{
			JOptionPane.showMessageDialog(null, "Insert a file with the following extension: \".lthclang\"");
			this.path = JOptionPane.showInputDialog("Program file path");
			this.f = new File(path);
			prgmReader();
		}
	}

	public List<String> getPrgm() {return prgm;}
}
