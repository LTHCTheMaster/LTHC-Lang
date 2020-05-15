package lthclang.var.number;

public class BVarInstSet 
{
	private float bVar = 0;
	
	public BVarInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public void setBVar(float var)
	{
		this.bVar = var;
	}
	
	public float getBVar()
	{
		return this.bVar;
	}

	public String getBVarStr() {
		return Float.toString(getBVar());
	}
}
