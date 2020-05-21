package lthclang.var.number;

public class Var 
{
	private String name;
	private float value;
	
	public Var(String name, float value) {
		this.name = name;
		this.value = value;
	}

	public float getValue() {
		return value;
	}
	
	public String getValueStr()
	{
		return Float.toString(getValue());
	}
	
	public void setValue(float value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}
}
