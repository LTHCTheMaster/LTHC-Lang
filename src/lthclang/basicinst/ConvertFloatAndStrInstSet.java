package lthclang.basicinst;

public class ConvertFloatAndStrInstSet 
{
	public ConvertFloatAndStrInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public String convertfs(float varf)
	{
		return Float.toString(varf);
	}
	
	public float convertsf(String vars)
	{
		return Float.parseFloat(vars);
	}
}
