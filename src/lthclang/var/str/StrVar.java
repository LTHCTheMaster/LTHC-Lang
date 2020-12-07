package lthclang.var.str;

public class StrVar 
{
	private String name;
	private String value;
	
	public StrVar(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return this.name;
	}
}
