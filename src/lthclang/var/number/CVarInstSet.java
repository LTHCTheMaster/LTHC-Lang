package lthclang.var.number;

public class CVarInstSet 
{
	private float cVar = 0;
	
	public CVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCVar(float var)
	{
		this.cVar = var;
	}
	
	public float getCVar()
	{
		return this.cVar;
	}

	public String getCVarStr() {
		return Float.toString(getCVar());
	}
}
