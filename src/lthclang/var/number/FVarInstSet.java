package lthclang.var.number;

public class FVarInstSet 
{
	private float fVar = 0;
	
	public FVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setFVar(float var)
	{
		this.fVar = var;
	}
	
	public float getFVar()
	{
		return this.fVar;
	}

	public String getFVarStr() {
		return Float.toString(getFVar());
	}
}
