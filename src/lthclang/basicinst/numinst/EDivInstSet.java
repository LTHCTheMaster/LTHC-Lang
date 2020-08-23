package lthclang.basicinst.numinst;

public class EDivInstSet {
	public EDivInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public float eDivNumVar(float a, float b)
	{
		return (a - (a % b)) / b;
	}
}
