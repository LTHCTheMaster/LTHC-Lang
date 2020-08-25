package lthclang.var.number;

import java.util.ArrayList;
import java.util.List;

public class ListVar 
{
	private String name;
	private List<Float> list = new ArrayList<Float>();
	
	public ListVar(String name, List<Float> list)
	{
		this.name = name;
		this.list = list;
	}
	
	public List<Float> getList()
	{
		return this.list;
	}
	
	public void setAllInList(List<Float> list)
	{
		this.list.removeAll(getList());
		this.list = list;
	}
	public void setInList(int index, float value)
	{
		this.list.set(index, value);
	}
	
	public void addAtEndOfList(float value)
	{
		this.list.add(value);
	}
	
	public String getName()
	{
		return this.name;
	}
}
