package lthclang.basicinst.numinst;

import java.util.Random;

public class RandomInstSet 
{
	private Random rand = new Random();
	
	public RandomInstSet() {
		// TODO Auto-generated constructor stub
	}
	
	public float randomInt(int adjust, int limit)
	{
		return (float)(adjust + rand.nextInt(limit-adjust));
	}
	
	public float randomInt(int limit)
	{
		return (float)(rand.nextInt(limit));
	}
	
	public float randomFloat()
	{
		return rand.nextFloat();
	}
}