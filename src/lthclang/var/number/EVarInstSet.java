package lthclang.var.number;

public class EVarInstSet 
{
	private float eVar = 0;
	
	public EVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setEVar(float var)
	{
		this.eVar = var;
	}
	
	public float getEVar()
	{
		return this.eVar;
	}

	public String getDVarStr() {
		return Float.toString(getEVar());
	}
}
