package lthclang.var.number;

public class DVarInstSet 
{
	private float dVar = 0;
	
	public DVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setDVar(float var)
	{
		this.dVar = var;
	}
	
	public float getDVar()
	{
		return this.dVar;
	}

	public String getDVarStr() {
		return Float.toString(getDVar());
	}
}
