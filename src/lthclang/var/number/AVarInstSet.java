package lthclang.var.number;

public class AVarInstSet 
{
	private float aVar = 0;
	
	public AVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setAVar(float var)
	{
		this.aVar = var;
	}
	
	public float getAVar()
	{
		return this.aVar;
	}

	public String getAVarStr() {
		return Float.toString(getAVar());
	}
}
