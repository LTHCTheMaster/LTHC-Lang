package lthclang.basicinst.strinst;

import javax.swing.JOptionPane;

public class StrInputInstSet 
{
	public StrInputInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public String strInput()
	{
		return JOptionPane.showInputDialog("give me a message");
	}
	
	public String cStrInput(String msg)
	{
		return JOptionPane.showInputDialog(msg);
	}
}