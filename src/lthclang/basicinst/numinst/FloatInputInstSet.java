package lthclang.basicinst.numinst;

import javax.swing.JOptionPane;

public class FloatInputInstSet 
{
	public FloatInputInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public float floatInput()
	{
		return Float.parseFloat(JOptionPane.showInputDialog("Give me a number"));
	}
	
	public float cFloatInput(String msg)
	{
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}
}
